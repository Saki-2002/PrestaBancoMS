FROM openjdk:17
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} ms-userRegister.jar
ENTRYPOINT ["java", "-jar","/ms-userRegister.jar"]