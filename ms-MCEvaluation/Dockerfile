FROM openjdk:17
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} ms-MCEvaluation.jar
ENTRYPOINT ["java", "-jar","/ms-MCEvaluation.jar"]