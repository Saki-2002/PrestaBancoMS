FROM openjdk:17
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} ms-MCApplication.jar
ENTRYPOINT ["java", "-jar","/ms-MCApplication.jar"]