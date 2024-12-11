FROM openjdk:17
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} ms-mcevaluation.jar
ENTRYPOINT ["java", "-jar","/ms-mcevaluation.jar"]