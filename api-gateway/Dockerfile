FROM eclipse-temurin:25-alpine AS build

WORKDIR /api-gateway

COPY api-gateway/mvnw .
COPY api-gateway/.mvn .mvn
COPY api-gateway/pom.xml .
COPY api-gateway/src src

RUN --mount=type=cache,target=/root/.m2/repository \
    ./mvnw package -DskipTests


FROM eclipse-temurin:25-jre-alpine

WORKDIR /api-gateway

COPY --from=build /api-gateway/target/*.jar api-gateway.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "api-gateway.jar"]