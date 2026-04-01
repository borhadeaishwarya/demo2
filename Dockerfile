FROM eclipse-temurin:17-jdk
MAINTAINER "bkit"
COPY target/DataJpaApp-0.0.1-SNAPSHOT DataJpaApp-0.0.1-SNAPSHOT
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "spring-boot-app.jar"]
