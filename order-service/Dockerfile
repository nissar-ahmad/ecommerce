# Use OpenJDK 17 as the base image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file (generated by Maven) into the container
COPY target/order-service-0.0.1-SNAPSHOT.jar order-service.jar

# Expose the port that the service will be running on
EXPOSE 8084

# Command to run the microservice
ENTRYPOINT ["java", "-jar", "order-service.jar"]
