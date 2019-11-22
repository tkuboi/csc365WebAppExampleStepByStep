1. copy context.xml to /src/main/webapp/META-INF/.
2. open the context.xml and edit and add necessary information, such as host url, dbname, user, password, to establish connection to the databases.
3. open the web.xml in /src/main/webapp/WEB-INF/
4. replace the <web-app> tag with the following tag. 
`<web-app  xmlns="http://java.sun.com/xml/ns/javaee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd"
         version="2.5">
         `
5. copy the following text and paste it in the file.
`
  <resource-ref>
      <description>DB Connection</description>
      <res-ref-name>jdbc/dbname</res-ref-name>
      <res-type>javax.sql.DataSource</res-type>
      <res-auth>Container</res-auth>
  </resource-ref>
`

6. edit and change the dbname to an appropriate dbname.
7. in /src/main/java/edu/calpoly/csc365/example1/, create a package controller.
8. In the controller package, create a class CustomerServlet, which extends HttpServlet.
You can copy CustomerServlet.java included in this directory to /src/main/java/edu/calpoly/csc365/example1/controller.
9. in /src/main/java/edu/calpoly/csc365/example1/ create a package dao.
10. copy files in /src/main/java/edu/calpoly/csc365/example1/dao in this repo, to your /src/main/java/edu/calpoly/csc365/example1/dao directory.
11. in /src/main/java/edu/calpoly/csc365/example1/ create a package entity.
12. copy files in /src/main/java/edu/calpoly/csc365/example1/entity in this repo, to your /src/main/java/edu/calpoly/csc365/example1/entity directory.
13. create customer.jsp in /src/main/webapp/. You can copy customer.jsp included in this directory to your /src/main/webapp/ directory.
14. build and run the project
15. on your browser, go to http://localhost:8080/{app_name}/customers
16. you should be able to see a page with customers.
17. add the information from other columns of Customer table to the page.
