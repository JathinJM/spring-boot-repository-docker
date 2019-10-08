FROM openjdk:8
EXPOSE 8080:8085
#adding jar file from target
ADD target/docker-spring-boot.jar docker-spring-boot.jar
ENTRYPOINT ["java", "-jar", "/docker-spring-boot.jar"]