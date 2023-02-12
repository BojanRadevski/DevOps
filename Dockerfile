# Build stage
FROM maven:3.6.3-openjdk-11 AS build
WORKDIR /app
COPY . .
RUN mvn install -DskipTests
#jar package za java aplikacijat ja stava u jar
#

# Package stage
#koa ke se povika docker build -t javabackend . se pravi image
# mesto tocka moze da se stai lokacija kaj se naogja dockerfileot
# .= pateka kaj sho se naogja fajlot
FROM openjdk:11-jre-slim
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
