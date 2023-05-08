FROM openjdk:17



ADD target/springrest-0.0.1-SNAPSHOT.jar springrest.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "springrest.jar"]