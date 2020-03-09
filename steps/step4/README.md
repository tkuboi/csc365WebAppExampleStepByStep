# STEP 4: Create pages to POST data onto the server.
1. Let's add pages to create and update a customer.
2. copy CustomerEditServlet.java and CustomerCreateServlet.java included in this directory to /src/main/java/edu/calpoly/csc365/example1/controller/.
3. Those two servlets contain doPost method to handle POST request from users. The doPost in CustomerCreateServlet.java redirects user to ./edit_customer instead of forwarding the request to CustomerEditServlet so that the form will not be re-submitted when the user clicks the reload or back button.
4. copy customer_edit.jsp and customer_create.jsp included in this directory to /src/main/webapp/.
5. build and run the project
6. go to http://localhost:8080/{app_name}/customers
7. click add, and edit links. 
8. test if you can create a new customer, and update a customer.
