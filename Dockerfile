FROM openjdk:12
LABEL Description="This image is used to execute the fishbone demo service" Vendor="arburk" Version="1.0-SNAPSHOT"
ARG JAR_FILE=target/*.jar
ENV APP_NAME=fishbone_service.jar
COPY ${JAR_FILE} ${APP_NAME}
EXPOSE 8080/tcp
ENTRYPOINT java -jar /${APP_NAME}
