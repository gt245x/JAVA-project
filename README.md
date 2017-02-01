#JAVA APP PROJECT

**The app project uses JAVA for a RESTful API application with Spring Boot framework, AngularJS and postgreSQL/mySQL database. The app project has 2 different applications utilizing CREATE, UPDATE, READ and DELETE (CRUD) functionalities. 

##Installation
    - Ensure that java is installed
    - The master branch uses postgreSQL database while mysql branch uses mySQL database.
    - Open postgreSQL or mySQL database.
    - Open application.properties and update "spring.datasource.url" with the database port "<port>" and database name "<db>"
    - Update "spring.datasource.username" with the database username
    - Update "spring.datasource.password" with the database password.
    - cd to the file directory 
    - run "mvn clean install" to build all the modules and install it in the local repository
    - run the app by "java -jar target/demo-0.0.0.1-SNAPSHOT.jar"
    - The app can be viewed on localhost using port:3000


## FEATURES

- The app shows 2 distinct applications of CRUD
- Extensive use of numerous AngularJS features.
- Use of PostgreSQL and mySQL database
- Use of Hibernate to connect to the database.



