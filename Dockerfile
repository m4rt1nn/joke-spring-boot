# Use the official OpenJDK 21 image as the base image
FROM openjdk:21-jdk-slim AS builder

# Set the working directory in the container
WORKDIR /app

# Copy your Maven or Gradle build files (pom.xml or build.gradle) into the container
COPY ./. .

# Build your application (the command depends on your build tool, here I'm using Maven)
RUN ./mvnw clean package -DskipTests

# Create a smaller image for the final stage
FROM openjdk:21-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the jar file from the builder stage (target directory in case of Maven)
COPY --from=builder /app/target/*.jar app.jar

# Expose the port your app will run on
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
