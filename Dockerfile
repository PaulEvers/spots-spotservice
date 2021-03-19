FROM openjdk:11-jdk-slim

ARG JAR_FILE=build/libs/*.jar

COPY ${JAR_FILE} spot-service.jar

ENTRYPOINT ["java","-jar","/spot-service.jar"]