FROM openjdk:17-jdk-slim
WORKDIR /docker2
COPY target/DockerProj02.jar /docker2
EXPOSE 8080
RUN ["java","-jar","DockerProj02.jar"]