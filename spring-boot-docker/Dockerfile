#FROM eclipse-temurin:17-jdk-alpine
#
#LABEL maintainer="sandesh@gmail.com"
#
#WORKDIR /app
#
#COPY target/spring-boot-docker-0.0.1-SNAPSHOT.jar /app/springboot-docker-app.jar
#
#ENTRYPOINT ["java","-jar","springboot-docker-app.jar"]


FROM eclipse-temurin:17-jdk-alpine

LABEL maintainer="sandesh@gmail.com"

WORKDIR /app

COPY target/*.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]
