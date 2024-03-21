# Delivery Discovery Service

## Overview
The Delivery Discovery Service plays a critical role in the **Delivery** application's microservices architecture. It acts as a service registry that enables microservices within the Delivery application to dynamically discover and communicate with each other.

## Architecture Interaction
The Delivery Discovery Service facilitates the auto-registration and location of microservices, making it essential for achieving scalability and resilience in the Delivery application. It interacts closely with the following components:

- [Delivery API Gateway](https://github.com/KyryloBulyk/delivery-api-gateway): Utilizes the Discovery Service to route requests to the appropriate microservices based on their availability and location.

- [Delivery Users Microservice](https://github.com/KyryloBulyk/delivery-users): Registers itself with the Discovery Service to be discoverable by the API Gateway and other microservices.

- [Delivery Configuration](https://github.com/KyryloBulyk/delivery-configuration): Works in conjunction with the Discovery Service to provide dynamic configuration updates to registered microservices.

The Discovery Service ensures that microservices can find and communicate with each other efficiently, thereby enhancing the overall resilience and flexibility of the Delivery application.

## Getting Started

### Prerequisites
Ensure the following prerequisites are met before setting up the Delivery Discovery Service:
- Java 11 or newer.
- Maven, for managing project dependencies and facilitating the build process.

### Configuration
Specific configurations for service registration and discovery should be specified in the `application.properties` or `application.yml` file. This includes the Discovery Service's own registration details and configurations for communicating with the database or other infrastructure components if needed.

### Running the Application
To start the Delivery Discovery Service, follow these steps:

1. Open a terminal and navigate to the root directory of the Discovery Service project.
2. Execute the following Maven command to compile the application and start the Spring Boot application:

```bash
mvn spring-boot:run
```
Upon successful startup, the Discovery Service will begin listening for registration requests from microservices and serve as the central registry for service discovery within the Delivery application.

## Contributing
Contributions to the Delivery Discovery Service are highly encouraged, whether it's through feature development, bug fixes, or improving the documentation. Refer to the contributing guidelines in the project's GitHub repository for more information on how to contribute.