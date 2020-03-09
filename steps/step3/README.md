# STEP 3: Create a data source. Use JSP as the view for our application.
1. Let's create a context for our database connection.
2. Create a directory META-INF in /src/main/webapp/.
3. Create a file, context.xml, in the META-INF and copy the content of the context.xml included in this directory.
4. open the context.xml and make the following edits to the Resource tag.
- Replace the dbname with your database name in the name and url strings.
- Set the username and password for your database.
5. open the web.xml in /src/main/webapp/WEB-INF/ or copy the web.xml included in this directory.
6. replace the ```<web-app>``` tag with the following tag. 
```
<web-app  xmlns="http://java.sun.com/xml/ns/javaee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd"
         version="2.5">
```
7. Let's register a resource reference for our database connection. copy the following text and paste it in the web.xml file.
```
  <resource-ref>
      <description>DB Connection</description>
      <res-ref-name>jdbc/dbname</res-ref-name>
      <res-type>javax.sql.DataSource</res-type>
      <res-auth>Container</res-auth>
  </resource-ref>
```

8. edit and change the dbname in the res-ref-name tag to an appropriate dbname. 
9. copy and paste the entire <welcome-file-list> section in the web.xml
10. We are going to adopt the Model View Controller design pattern. So, you are going to create the following directory structure under /src/main/java on your computer:
```
/edu
    /calpoly
        /csc365
            /example1/
                /controller
                /dao
                /entity

```
- The model is classes in entity.
- The view is JSPs in /src/main/webapp/.
- The controller is servlets in controller.

11. in /src/main/java/edu/calpoly/csc365/example1/, create a package 'controller'.
12. In the controller package, create a class CustomerServlet, which extends HttpServlet.
You can copy CustomerServlet.java included in this directory to /src/main/java/edu/calpoly/csc365/example1/controller.
13. in /src/main/java/edu/calpoly/csc365/example1/ create a package 'dao'.
14. copy files in /src/main/java/edu/calpoly/csc365/example1/dao in this repo, to your /src/main/java/edu/calpoly/csc365/example1/dao directory.
15. change the dbname in line 13 of /src/main/java/edu/calpoly/csc365/example1/dao/DaoManagerFactory.jsp
16. in /src/main/java/edu/calpoly/csc365/example1/ create a package 'entity'.
17. copy files in /src/main/java/edu/calpoly/csc365/example1/entity in this repo, to your /src/main/java/edu/calpoly/csc365/example1/entity directory.
You might need to change table name and column names in sql included in CustomerDaoImpl.java if they do no match the tables in your database.
18. create customer.jsp in /src/main/webapp/, or copy customer.jsp included in this directory to your /src/main/webapp/ directory.
19. open /src/main/webapp/index.jsp and add the following link to the customers page in the body after the ```<h2>Hello World!</h2>```.
```
<p><a href="./customers">customers</a></p>
```
20. build and run the project
21. on your browser, go to http://localhost:8080/{app_name}/ and click the customers link.
22. you should be able to see a page with customers.
23. add the information from other columns of Customer table to the page.
24. The edit and add links does not work at this stage. We are going to make the links work in step 4.

