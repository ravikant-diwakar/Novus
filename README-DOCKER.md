# Run the ecommerce Spring Boot app with Docker

This project serves its frontend templates from `src/main/resources/templates` and the Java backend from the Spring Boot application.

Quick instructions (PowerShell):

```powershell
# From the project root: c:\...\ecommerce
cd 'C:\Users\KIIT\Downloads\JioAICloud-Download\JioAICloud-Download\ecommerce'

# Build and run with Docker Compose (single command):
docker compose up --build

# Or run detached:
docker compose up --build -d

# To stop and remove containers:
docker compose down
```

Notes:
- The Dockerfile uses a multi-stage build (Maven build image -> slim JRE image). This means you do not need Java or Maven installed on the host to build the image, but you do need Docker Engine.
- The app will be available on port `8080` (map `8080:8080`). Change `docker-compose.yml` if you prefer a different host port.
- If you want to run tests in the container build, remove `-DskipTests` from the Dockerfile `mvn` command.
