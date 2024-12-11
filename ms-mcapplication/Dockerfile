FROM openjdk:17
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} ms-mcapplication.jar
ENTRYPOINT ["java", "-jar","/ms-mcapplication.jar"]