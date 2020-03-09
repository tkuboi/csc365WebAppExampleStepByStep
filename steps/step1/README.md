# Step 1: Hello World

## Create a Maven Project

1. On IntelliJ IDE, Create New Project
2. choose Maven
3. make sure that the Project SDK is set
3. check Create from archetype
4. From the list of archetype, select org.apache.maven.archetypes:maven-archetype-webapp
5. Type in GroupId. Ex. csc365
6. Type in ArtifactId. Ex. example1
7. After creating the project, you should have the following files and directory structures:
```
    - pom.xml
    - src
        - main
            - webapp
                - WEB-INF
                    - web.xml
                - index.jsp
```
8. From the pox.xml included in this directory, copy the build section over to your pom.xml.
9. build the project
10. Edit Run Configuration
    - create a Maven configuration by selecting Maven from the list of templates on the left side. 
    - set the command line: ```clean compile war:war tomcat7:run```
    - save the configuration by clicking 'apply' and then 'ok'.
11. run the app using the configuration you have just created.
12. on your web browser, go to http://localhost:8080/{app_name}
13. you should be able to see `Hello World!`
