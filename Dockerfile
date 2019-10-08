FROM openjdk:8
EXPOSE 8080:8085
ADD target/spring-boot-docker-rest.jar spring-boot-docker-rest.jar
ENTRYPOINT ["java", "-jar", "/spring-boot-docker-rest.jar"]