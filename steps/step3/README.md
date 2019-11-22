# STEP 3: Create a data source. Use JSP as the view for our application.
1. Let's create a context for our database connection. copy context.xml to /src/main/webapp/META-INF/.
2. open the context.xml and edit and add necessary information, such as host url, dbname, user, password, to establish connection to the databases.
3. open the web.xml in /src/main/webapp/WEB-INF/ or copy the web.xml included in this directory.
4. replace the ```<web-app>``` tag with the following tag. 
```
<web-app  xmlns="http://java.sun.com/xml/ns/javaee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd"
         version="2.5">
```
5. Let's register a resource reference for our database connection. copy the following text and paste it in the file.
```
  <resource-ref>
      <description>DB Connection</description>
      <res-ref-name>jdbc/dbname</res-ref-name>
      <res-type>javax.sql.DataSource</res-type>
      <res-auth>Container</res-auth>
  </resource-ref>
```

6. edit and change the dbname to an appropriate dbname. 
7. Also, change the dbname in line 13 of /src/main/java/edu/calpoly/csc365/example1/dao/DaoManagerFactory.jsp
8. in /src/main/java/edu/calpoly/csc365/example1/, create a package controller.
9. In the controller package, create a class CustomerServlet, which extends HttpServlet.
You can copy CustomerServlet.java included in this directory to /src/main/java/edu/calpoly/csc365/example1/controller.
10. in /src/main/java/edu/calpoly/csc365/example1/ create a package dao.
11. copy files in /src/main/java/edu/calpoly/csc365/example1/dao in this repo, to your /src/main/java/edu/calpoly/csc365/example1/dao directory.
12. in /src/main/java/edu/calpoly/csc365/example1/ create a package entity.
13. copy files in /src/main/java/edu/calpoly/csc365/example1/entity in this repo, to your /src/main/java/edu/calpoly/csc365/example1/entity directory.
14. create customer.jsp in /src/main/webapp/. You can copy customer.jsp included in this directory to your /src/main/webapp/ directory.
15. build and run the project
16. on your browser, go to http://localhost:8080/{app_name}/customers
17. you should be able to see a page with customers.
18. add the information from other columns of Customer table to the page.
