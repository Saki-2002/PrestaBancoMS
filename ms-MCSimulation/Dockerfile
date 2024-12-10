FROM openjdk:17
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} ms-MCSimulation.jar
ENTRYPOINT ["java", "-jar","/ms-MCSimulation.jar"]