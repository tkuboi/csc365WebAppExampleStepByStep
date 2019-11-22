# Step 1

## Create a Maven Project

1. On IntelliJ IDE, Create New Project
2. choose Maven
3. make sure that the Project SDK is set
3. check Create from archetype
4. From the list of archetype, select org.apache.maven.archetypes:maven-archetype-webapp
5. Type in GroupId. Ex. csc365
6. Type in ArtifactId. Ex. example1
7. After creating the project, you should have the following files and directory structures:
    - pom.xml
    - src
        - main
            - webapp
                - WEB-INF
                    - web.xml
                - index.jsp

8. build the project
9. Edit Run Configuration
    - create a Maven configuration
    - set the command line: `clean compile war:war tomcat7:run`
10. run the app
11. on your web browser, go to http://localhost:8080/{app_name}
12. you should be able to see `Hello World!`