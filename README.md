# RabbitMQ Demo

This is a Spring Boot application that sends messages to RabbitMQ when a REST endpoint is called.

## Prerequisites

- Java 17 or later
- Maven
- RabbitMQ server running locally or accessible

## Running the Application

1. **Clone the repository:**

   ```bash
   git clone <repository-url>
   cd rabbitmq-demo
   ```

2. **Build the project:**

   ```bash
   ./mvnw clean install
   ```

3. **Run the application:**

   ```bash
   ./mvnw spring-boot:run
   ```

4. **Send a message to RabbitMQ:**

   Open your browser or use a tool like `curl` to access the following URL:

   ```
   http://localhost:8080/send
   ```

   This will send a message to the RabbitMQ queue named "hello".

## Configuration

The RabbitMQ connection settings can be configured in `src/main/resources/application.properties`.

```properties
spring.rabbitmq.host=localhost
spring.rabbitmq.port=5672
spring.rabbitmq.username=guest
spring.rabbitmq.password=guest
```

Adjust these settings according to your RabbitMQ server configuration.
