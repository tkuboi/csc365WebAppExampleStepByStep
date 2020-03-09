# STEP 5: Secure our web app by adding a login page.
1. Let's add a login page.
2. copy login.jsp included in this directory to /src/main/webapp/.
3. copy LoginServlet.java included in this directory to /src/main/java/edu/calpoly/csc365/example1/controller/.
4. open your index.jsp, and add a link to ./login in the body after the link to the customers page.
```<p><a href="./login">login</a></p>```
5. Let's add a service to authenticate a user: create a package 'service' in /src/main/java/edu/calpoly/csc365/example1/, and copy AuthenticationService.java included in this directory to /src/main/java/edu/calpoly/csc365/example1/service/.
6. Let's modify the CustomerServlet to check if the user has been authenticated by checking a cookie.
7. Open and modify CustomerServlet.jsp. Change the code in doGet method so that it checks if the cookie is present before directing the user to the customers page. If the cookie is not present, it redirect the user to the login page. Also, let's show a personalized message to the user: ```request.setAttribute("message", "Hello " + loginCookie.getValue());```. Copy and paste the doGet method from the CustomerServlet.java included in this directory to your CustomerServlet.java.
8. Create Users table with name and pass columns in your database, and populate the table with some users with their passwords.
```
CREATE TABLE Users (
  name varchar(50) NOT NULL,
  pass varchar(50) NOT NULL,
  PRIMARY KEY (name)
)
```
9. build and run the project.
10. go to http://localhost:8080/{app_name}/customers
11. You should be redirected to the login page.
12. If you want to guard other pages, you need to employ the same scheme in doGet and doPost methods.
13. To add logout functionality, copy LogoutServlet.java included in this directory to /src/main/java/edu/calpoly/csc365/example1/controller/.
14. open your index.jsp, and add a link to ./logout in the body after the link to the login page.
```<p><a href="./logout">logout</a></p>```
15. When a user logs out, the code in LogoutServlet.java sets the expiration of the cookie to 0, so that the cookie expires immediately.
