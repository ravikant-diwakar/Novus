# Multi-stage Dockerfile that uses the project's Maven wrapper to build
# This avoids relying on a specific `maven` image tag.

FROM eclipse-temurin:17-jdk-jammy AS build
WORKDIR /app

# Copy project files (including the Maven wrapper) and build
COPY . ./
RUN chmod +x ./mvnw || true
RUN ./mvnw -B -U -DskipTests clean package

FROM eclipse-temurin:17-jre-jammy
WORKDIR /app

# Install mysql-client for the wait script
RUN apt-get update && apt-get install -y mysql-client && rm -rf /var/lib/apt/lists/*

# Copy the jar produced by the build stage
COPY --from=build /app/target/*.jar app.jar
COPY wait-for-db.sh wait-for-db.sh
RUN chmod +x wait-for-db.sh

EXPOSE 8080
ENTRYPOINT ["./wait-for-db.sh", "db", "sh", "-c", "java -jar /app/app.jar"]
