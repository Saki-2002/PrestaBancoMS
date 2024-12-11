FROM openjdk:17
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} ms-mcsimulation.jar
ENTRYPOINT ["java", "-jar","/ms-mcsimulation.jar"]