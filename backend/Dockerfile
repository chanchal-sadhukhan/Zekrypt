# ==========================================
# BASE STAGE
# ==========================================
FROM eclipse-temurin:21-jdk AS base

WORKDIR /app

COPY . .

RUN chmod +x mvnw

# ==========================================
# DEVELOPMENT STAGE
# ==========================================
FROM base AS development

EXPOSE 8080

CMD ["./mvnw", "spring-boot:run", "-Dspring-boot.run.profiles=dev"]

# ==========================================
# BUILD STAGE
# ==========================================
FROM base AS build

RUN ./mvnw clean package -DskipTests

# ==========================================
# PRODUCTION STAGE
# ==========================================
FROM eclipse-temurin:21-jre AS production

# Create non-root user
RUN groupadd -r spring && useradd -r -g spring spring

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

RUN chown -R spring:spring /app

USER spring

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
