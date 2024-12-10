FROM openjdk:17
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} ms-MCTracking.jar
ENTRYPOINT ["java", "-jar","/ms-MCTracking.jar"]