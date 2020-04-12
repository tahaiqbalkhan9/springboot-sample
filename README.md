
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

More Details at:
<br>https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins.html

### How to deploy jar on Docker:
- install docker. On windows and mac you can refer to https://www.docker.com/products/docker-desktop.
- confirm docker installed successfully by running command ```docker --version```
- run command ```mvn package && mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)```
- run command ```docker build -t springboot-sample . ``` to build docker container
- run command ```docker run -p 8080:8080 -t springboot-sample:latest ``` to kickoff the server 
    - For Remote Debug ```docker run -e "JAVA_TOOL_OPTIONS=-agentlib:jdwp=transport=dt_socket,address=5005,server=y,suspend=n" -p 8080:8080 -p 5005:5005 -t springboot-sample```
    - Configure on Intellij refer to https://blog.jetbrains.com/idea/2019/04/debug-your-java-applications-in-docker-using-intellij-idea/
- Navigate to: http://localhost:8080/users 

More Details at:
<br>https://spring.io/guides/gs/spring-boot-docker/

### How to deploy jar on Kubernetes:
- you should have docker desktop (with kubernetes) running on your system. confirm by running below commands:
    - docker ```docker --version```
    - kubernetes ```kubectl version```
- run shell script ```./kubectl-build.sh``` to kickoff deployment on kubernetes
- (For First Time ONLY) ```kubectl expose deployment springboot-sample --type=LoadBalancer --port 8080 --target-port 8080``` 
- Navigate to: http://localhost:8080/users 

More Details at:
<br>https://spring.io/guides/gs/spring-boot-kubernetes/
<br>https://kubernetes.io/docs/tutorials/kubernetes-basics/
<br>https://medium.com/google-cloud/kubernetes-nodeport-vs-loadbalancer-vs-ingress-when-should-i-use-what-922f010849e0

### Features already in Project:
- Spring boot framework
- Some unit test cases
- API calls and dependency injection
- Swagger Docs
- Create an executable jar package using either **maven** or **gradle**
- Deploy the jar using **Docker**

### CI/CD Using Jenkins Pipeline Feature

Setup Jenkins using Docker container from: https://hub.docker.com/r/jenkins/jenkins
	- ```docker pull jenkins/jenkins```
   	- Fireup Jenkins container by executing command below. ```sudo docker run -p 8080:8080 -p 50000:50000 -v jenkins_home:/var/jenkins_home jenkins/jenkins:lts```
   	- this will automatically create a 'jenkins_home' docker volume on the host machine, that will survive the container stop/restart/deletion. Instructions here: https://github.com/jenkinsci/docker/blob/master/README.md
	- Follow installation steps to Install Jenkins. 
	- Note that we make use of Jenkins pipeline and following Declarative syntax. ``Jenkinsfile`` is already checked into root of project.   	

### Features to come:
- Service Registory, Discovery and Invocation using **Consul**
- **CI/CD** support to come later, this will require a build server VM on our computers i.e. **Jenkins**

# License

## MIT License

Copyright (c) 2020 Taha Iqbal

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
