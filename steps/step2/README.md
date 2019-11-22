1. open the pom.xml
2. In order to use MySQL JDBC driver, copy and paste the following text in the pom.xml
``` <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>1.7</maven.compiler.source>
    <maven.compiler.target>1.7</maven.compiler.target>
  </properties>

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
  <build>
    <finalName>example1</finalName>
    <pluginManagement><!-- lock down plugins versions to avoid using Maven defaults (may be moved to parent pom) -->
      <plugins>
        <plugin>
          <groupId>org.apache.tomcat.maven</groupId>
          <artifactId>tomcat7-maven-plugin</artifactId>
          <version>2.2</version>
        </plugin>
      </plugins>
    </pluginManagement>
  </build>
  ```

3. update the project: let Maven get all the dependencies.
4. open web.xml in webapp/WEB-INF

4. under the directory src/main, create a directory java, if it does not exist.
5. under src/main/java, create directories (packages), edu/calpoly/csc365/example1
6. create a file TestServlet.java at src/main/java/edu/calpoly/csc365/example1
7. copy and paste the content of TestServlet.java in this step2 directory.
8. Build and run the project
9. On your browser, go to http://localhost:8080/{app_name}/test
10. You should be able to see data from the database

