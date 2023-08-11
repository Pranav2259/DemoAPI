# TASKTRACKER API
## Description

Developed a robust TaskTracker API using Java, Jersey, and Maven, seamlessly integrated with a PostgreSQL database. This API allows efficient management of tasks by providing endpoints for resource retrieval, creation, updating, and deletion.

## Tech Used

Java, Jersey, Maven, PostgreSQL, RESTful API

## Key Features

Resource Management: Implemented a RESTful API structure to handle tasks, enabling users to perform CRUD (Create, Read, Update, Delete) operations.

Database Connectivity: Leveraged PostgreSQL to persistently store task data, ensuring data integrity and retrieval efficiency.

HTTP Methods: Utilized HTTP methods such as GET, POST, PUT, and DELETE to facilitate various operations on tasks.

Jersey Framework: Employed the Jersey framework to develop API endpoints, enhancing code modularity and ease of maintenance.

Maven Build: Managed project dependencies and builds using Maven, streamlining project setup and deployment.

## OUTCOME

The TaskTracker API offers a seamless solution for effective task management, enabling users to interact with tasks using standard HTTP methods. By integrating modern technologies and following best practices, the project showcases my proficiency in Java-based API development, database integration, and project management.

## Retrieve a list of all tasks.

GET /tasks/{id}: Retrieve a task by its ID.(http://localhost:8080/DemoAPI/webapi/task/{id})
## Retrieve a task by its ID.

GET /tasks: Retrieve a list of all tasks.(http://localhost:8080/DemoAPI/webapi/task)
## Create a new task.

POST /tasks: Create a new task.(http://localhost:8080/DemoAPI/webapi/task/newtask)
## Update an existing task by its ID.

PUT /tasks/{id}: Update an existing task by its ID.(http://localhost:8080/DemoAPI/webapi/task/update/{id})
## Delete a task by its ID.

DELETE /tasks/{id}: Delete a task by its ID.(http://localhost:8080/DemoAPI/webapi/task/delete/{id})

## AN EXAMPLE of record in JSON FORMAT - 
#### MEDIA TYPE - JSON AND XML

    {
        "description": "Prepare presentation",
        "id": "JIP-9933",
        "title": "Update Database"
        "duedate": "2024-11-21"
     } 

 ### P.S. Use DemoRepository.java in case you do not want to connect to SQL and want to use ArrayList to store a record.
