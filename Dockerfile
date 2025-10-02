FROM amazoncorretto:21.0.4-alpine3.18
WORKDIR /app
COPY target/app1.jar app.jar
EXPOSE 8080
ENTRYPOINT ["sh", "-c", "java -jar app.jar"]