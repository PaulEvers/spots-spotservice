# spots-spotservice
Microservice to CRUD Spot for the Spots application.

## How to build new image:

Build .jar without test:
`./gradlew clean build -x test`

Build image:
`docker build --build-arg JAR_FILE=spotservice-0.0.1-SNAPSHOT.jar -t paulevers/spot-service .`

Docker compose:
`docker-compose -f docker-compose.yml up -d`