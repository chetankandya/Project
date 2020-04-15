FROM openjdk:8
EXPOSE 8080
ADD target/springbootrestapiexample.jar springbootrestapiexample.jar 
ENTRYPOINT ["java","-jar","/springbootrestapiexample.jar"]