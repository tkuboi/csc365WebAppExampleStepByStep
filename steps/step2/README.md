# STEP 2: Let's test if we can connect to our database using MySQL JDBC driver.
0. You need to have the following Customer table in your database. If you do not have the table, create it. If you do but the table name, column names are different, you need to change the table name and column names in the sql included in TestServlet.java.
```
CREATE TABLE Customer (
  id int NOT NULL AUTO_INCREMENT,
  ssn char(11) DEFAULT NULL,
  name varchar(50) DEFAULT NULL,
  address varchar(255) DEFAULT NULL,
  phone char(12) DEFAULT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY ssn (ssn)
)
```
1. open the pom.xml.
2. In order to use MySQL JDBC driver, copy and paste the dependencies section in the following text to your pom.xml, replacing the existing dependencies sections.
``` 
  <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.11</version>
      <scope>test</scope>
    </dependency>
      <dependency>
          <groupId>javax</groupId>
          <artifactId>javaee-web-api</artifactId>
          <version>6.0</version>
          <scope>provided</scope>
      </dependency>
      <!-- https://mvnrepository.com/artifact/javax.servlet.jsp.jstl/jstl-api -->
      <dependency>
          <groupId>javax.servlet</groupId>
          <artifactId>jstl</artifactId>
          <version>1.2</version>
      </dependency>
    <dependency>
      <groupId>mysql</groupId>
      <artifactId>mysql-connector-java</artifactId>
      <version>8.0.15</version>
    </dependency>
  </dependencies>

  ```

3. update the project: let Maven import all the dependencies.
4. under the directory src/main, create a directory java, if it does not exist.
   Right click the directory and mark the directory as soure root.
5. under src/main/java, create a new package, edu.calpoly.csc365.example1, which is a directory structure looking like edu/calpoly/csc365/example1
6. create a new class TestServlet (TestServlet.java) at src/main/java/edu/calpoly/csc365/example1
7. copy and paste the content of TestServlet.java in this step2 directory. Make sure that the TestServlet class extends HttpServlet class, which makes http request and response accessible in the TestServlet class. 
8. Change the table name and column names in the sql query if they do not match tables and columns in your databse. 
9. In the TestServlet.java, change the dbname in JDBC_DB_URL. Set user and password in JDBC_USER and JDBC_PASS.
10. Build and run the project
11. On your browser, go to http://localhost:8080/{app_name}/test
12. You should be able to see data from the database

