#STEP 5: Secure our web app by adding a login page.
1. Let's add a login page.
2. copy login.jsp included in this directory to /src/main/webapp/.
3. copy LoginServlet.java included in this directory to /src/main/java/edu/calpoly/csc365/example1/controller/.
4. open your index.jsp, and add a link to ./login.
```<p><a href="./login">login</a> </p>```
5. Let's add a service to authenticate a user: create a package service in /src/main/java/edu/calpoly/csc365/example1/, and copy AuthenticationService.java included in this directory to /src/main/java/edu/calpoly/csc365/example1/service/.
6. Let's modify CustomerServlet to check if the user has been authenticated by checking a cookie.
7. Open and modify CustomerServlet.jsp. Change the code so that it becomes the same as CustomerServlet.jsp included in this directory.
8. Create Users table with name and pass columns in your database, and populate the table with some users.
9. build and run the project.
10. go to http://localhost:8080/{app_name}/customers
11. You should be redirected to the login page.
