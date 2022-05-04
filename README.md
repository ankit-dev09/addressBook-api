# addressBook-api

##Overview

Address book back end CRUD application used for managing Address books and contacts. 

###Acceptance Criteria

* Users should be able to add new contact entries
* Users should be able to remove existing contact entries
* Users should be able to print all contacts in an address book
* Users should be able to maintain multiple address books
* Users should be able to print a unique set of all contacts across multiple address books

## System Environment

* JDK 11.0.15
* Intellij Idea 2021.2 (Ultimate Edition)
* Apache Maven 
* Embedded Tomcat Server
* OS : MacOs BigSur
* GIT version control

## Project Structure

```aidl
-- main   (source code)

   -- java
      
      -- controller  (Rest Controller layer that intercepts the HTTP Requests)
      -- model    (Contains the Pojo of DB Entities)
      -- dao     (DB layer simulating address book data store)
      -- services  (Service layer that contains the business logic and interaction with dao layer)

-- test  (unit tests)

   -- java
   
      -- controller     (unit tests for controller classes)
      
pom.xml           (the Maven pom file)

README.md         (the project document file)
```

## Bulding the Project

To build the project, go to the root directory in terminal and run :
```
mvn clean install 
```

This command will create address-book-api.jar in the target folder of the project.

## API Documentation (OpenAPI)

After starting the application on server, access ```http://localhost:8080/swagger-ui/index.html``` to see the endpoints.