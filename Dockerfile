FROM maven:3.8.1-openjdk-17 AS build
WORKDIR /app
COPY target/testing-app.jar myApp.jar
EXPOSE 5000
ENTRYPOINT ["java", "-jar", "myApp.jar"]