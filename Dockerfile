FROM eclipse-temurin:23-jdk
EXPOSE 8080
ADD biold/libs/demo-iaka-0.0.1-SNAPSHOT.jar hello-sb.jar
ENTRYPOINT ["java","-jar","/hello-sb.jar"]