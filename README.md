# Spring Project Ecommerce API
This is a Spring Boot API for an ecommerce website. The API uses an H2 in-memory database to store data for users, products, addresses, and orders. The API allows users to create accounts, browse products, and place orders.
## Technologies Used
* Java 8
* Spring Boot
* H2 Database
* Maven
### Getting Started
 * To run the API, you will need to have Java 8 or higher installed on your system.
 * You will also need to have Maven installed. Maven is a build automation tool used to manage dependencies and build the project.
 * The API will start on port 8080. You can access the API at http://localhost:8080.
 
### API Endpoints
 The API has the following endpoints:

## Users
 * POST /users: Create a new user
* GET /users/{id}: Get a user by ID
* PUT /users/{id}: Update a user by ID
* DELETE /users/{id}: Delete a user by ID
## Products
* POST /products: Create a new product
* GET /products: Get all products
* GET /products/{id}: Get a product by ID
* PUT /products/{id}: Update a product by ID
* DELETE /products/{id}: Delete a product by ID
## Addresses
* POST /addresses: Create a new address
* GET /addresses/{id}: Get an address by ID
* PUT /addresses/{id}: Update an address by ID
* DELETE /addresses/{id}: Delete an address by ID
## Orders
* POST /orders: Create a new order
* GET /orders/{id}: Get an order by ID
