FROM openjdk:23
COPY target/Practica_I-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]