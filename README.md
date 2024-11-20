# Order Service API

## Overview
The Order Service API is a Java Spring Boot microservice designed to handle customer orders and transactions. It provides endpoints to create, retrieve, update, and delete orders. This service is built to be scalable and easy to integrate with other services in a microservices architecture.

## API Specification
- **Version**: 1.0.0
- **Base Path**: `/orders`

### Endpoints
- `GET /orders`: List all orders.
- `POST /orders`: Create a new order.
- `GET /orders/{id}`: Get an order by ID.
- `PUT /orders/{id}`: Update an order.
- `DELETE /orders/{id}`: Delete an order.

## Components
- **Order Schema**:
  - `id`: integer
  - `customer_id`: integer
  - `order_date`: string (date-time)
  - `status`: string
  - `total_amount`: number (double)

## Prerequisites

### Database Setup
- Ensure you have Docker installed on your machine.
- Run the following command to start a MySQL container:
  ```bash
  docker run --name mysql-order-db -e MYSQL_ROOT_PASSWORD=root -d mysql:latest
  ```
- Execute the following SQL scripts to set up the database:
  ```sql
  CREATE DATABASE IF NOT EXISTS `order_db`;
  SET sql_mode = 'ANSI_QUOTES';
  ```

## Build Instructions
This is a Spring Boot application. To build the application, ensure you have Maven installed and run:

```bash
mvn clean install
```

## Running the Application Locally
To run the application locally using Docker Compose, follow these steps:

1. Ensure Docker and Docker Compose are installed on your machine.
2. Navigate to the directory containing the `docker-compose.yml` file.
3. Run the following command:
   ```bash
   docker-compose up
   ```

### Docker Compose Setup
- The Docker Compose file will:
  - Create a MySQL container.
  - Execute `mvn clean install` to create the JAR file.
  - Build the service image locally using the Dockerfile.

Note: There is no need for a pre-existing MySQL instance as the Docker Compose setup handles it.

## Dependencies
- Spring Boot
- Flyway for database migrations
- MySQL
- Docker & Docker Compose

## Usage
Once the application is running, you can access the API at `http://localhost:8080/orders`.

## License
This project is licensed under the MIT License.