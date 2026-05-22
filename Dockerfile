# Build stage using Maven and Eclipse Temurin JDK 26
FROM maven:3-eclipse-temurin-26 AS build
COPY . .
RUN mvn clean package -DskipTests

# Run stage using Eclipse Temurin JDK 26
FROM eclipse-temurin:26-jdk
COPY --from=build /target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
