FROM openjdk:17
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} ms-mctracking.jar
ENTRYPOINT ["java", "-jar","/ms-mctracking.jar"]