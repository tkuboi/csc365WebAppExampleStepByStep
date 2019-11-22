package edu.calpoly.csc365.login.controller;

import edu.calpoly.csc365.login.dao.DaoManagerFactory;
import edu.calpoly.csc365.login.dao.Dao;
import edu.calpoly.csc365.login.dao.DaoManager;
import edu.calpoly.csc365.login.entity.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Set;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customers")
public class CustomerServlet extends HttpServlet {

  private DaoManager dm;
  private Dao<Customer> customerDao;

  public CustomerServlet() throws Exception {
    dm = DaoManagerFactory.createDaoManager();
    customerDao = dm.getCustomerDao();
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.addCookie(loginCookie);
    Set<Customer> customers = customerDao.getAll();
    request.setAttribute("customers", customers);
    request.setAttribute("message", "Hello ");
    request.getRequestDispatcher("customers.jsp").forward(request, response);
  }
}
