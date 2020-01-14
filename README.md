# springboot-sample
Spring boot testing project for play around features for spring boot, test cases and api docs.


Current active working branch is **development**.

This project makes use of **Project Lombok**, so you need to setup your IDE to use lombok, just dropin a jar. More details at: https://projectlombok.org/


### How to Run:
- Requires Java 8, Maven 4, Lombok
- Checkout the project
- navigate to **development** branch
- Go to project root, issue command: **mvn spring-boot:run**

- Navigate to: http://localhost:8080/users


### Features already in Project:
- Spring boot framework
- Some unit test cases
- API calls and dependency injection
- Swagger Docs

### Features to come:
- Create an executable jar package using either **maven** or **gradle**
- Deploy the jar using **Docker**
- Service Registory, Discovery and Invocation using **Consul**
- **CI/CD** support to come later, this will require a build server VM on our computers i.e. **Jenkins**
