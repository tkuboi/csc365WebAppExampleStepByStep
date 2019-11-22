package edu.calpoly.csc365.login.controller;

import edu.calpoly.csc365.login.dao.Dao;
import edu.calpoly.csc365.login.dao.DaoManager;
import edu.calpoly.csc365.login.dao.DaoManagerFactory;
import edu.calpoly.csc365.login.entity.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CustomerCreateServlet", urlPatterns = "/create_customer")
public class CustomerCreateServlet extends HttpServlet {
  private DaoManager dm = null;
  private Dao<Customer> customerDao = null;

  public CustomerCreateServlet() throws Exception {
    dm = DaoManagerFactory.createDaoManager();
    customerDao = dm.getCustomerDao();
  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.getRequestDispatcher("customer_create.jsp").forward(request, response);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Integer id = null;
    String ssn = request.getParameter("ssn");
    String name = request.getParameter("name");
    String address = request.getParameter("address");
    String phone = request.getParameter("phone");
    Customer customer = new Customer(id, ssn, name, address, phone);
    id = this.customerDao.insert(customer);
    response.sendRedirect("edit_customer?id=" + id.toString());
  }
}
