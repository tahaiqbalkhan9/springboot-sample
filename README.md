
# springboot-sample
Spring boot testing project for play around features for spring boot, test cases and api docs.


Current active working branch is **development**.

This project makes use of **Project Lombok**, so you need to setup your IDE to use lombok, just dropin a jar. More details at: https://projectlombok.org/


### How to Run:
- Requires Java 8, Maven 4, Lombok
- Checkout the project
- navigate to **development** branch.
- Navigate to project root, issue command:   **mvn spring-boot:run**

- Navigate to: http://localhost:8080/users

#### How to Kill app:
It is noticed that Ctrl+c won't terminate the springboot app. The solution on windows is to find the id and kill the process:
```sh
d:\> netstat -ano | find "8080"
d:\> taskkill /F /PID 19276 -- 19726 is process id retrieved in previous step
```
### How to Create executable jar:
- run command ```mvn package```. Will generate jar file under **target** folder
- run jar file by ```java -jar target/springboot-sample-0.0.1-SNAPSHOT.jar```
- Navigate to: http://localhost:8080/users 

- More Details at: https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins.html

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
