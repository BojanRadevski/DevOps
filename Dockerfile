# Build stage
FROM maven:3.6.3-openjdk-11 AS build
WORKDIR /app
COPY . .
RUN mvn install -DskipTests

# Package stage
FROM openjdk:11-jre-slim
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
