# DemoAPI
Task Tracker API with PostgreSQL Backend
I created this API using the JAVA Jersey project over Maven and used Postgre SQL as Database.

# REST API
The REST API for the example app is described below.


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

 # P.S. Use DemoRepository.java in case you do not want to connect to SQL and want to use ArrayList to Story a record.
