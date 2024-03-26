**Book Management API
**This repository contains a simple RESTful API for managing books. The API allows users to perform CRUD (Create, Read, Update, Delete) operations on book entities.

Getting Started
To get started with the Book Management API, follow these steps:

Clone the repository to your local machine:

bash
Copy code
git clone <repository_url>
Ensure you have Java and Maven installed on your machine.

Navigate to the project directory and build the project:

bash
Copy code
mvn clean install
Run the application:

bash
Copy code
mvn spring-boot:run


Access the Swagger documentation for API endpoints by navigating to http://localhost:8080/swagger-ui/index.html# in your web browser.

API Endpoints:

Create a Book
URL:/api/books/add

Method: POST
   {
  "id": 0,
  "title": "string",
  "author": "string"
}
Response: Newly created book object with assigned ID.

Get a Book
URL: /api/books/{id}
Method: GET
Response: Details of the book with the specified ID.

Get All Books
URL: /api/books
Method: GET
Response: A list of all books.


Update a Book
URL: /api/books/{id}
Method: PUT
Request Body: Updated book object with new values.
Response: Updated book object.
Delete a Book

URL: /api/books/{id}
Method: DELETE
Response: No content.

Error Handling
If a requested resource is not found, the API returns a exception stating "Resource not Found at ID"

Input data is validated, and if validation fails, appropriate error messages are returned.

Contributing
Contributions to this project are welcome! If you find any issues or have suggestions for improvements, please open an issue or create a pull request.
