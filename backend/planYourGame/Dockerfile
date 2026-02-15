# Etapa 1: Build da aplicação usando Maven
FROM maven:3.9-eclipse-temurin-21 AS build

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia os arquivos de configuração do Maven
COPY pom.xml .
COPY src ./src

# Faz o build do projeto e cria o JAR
RUN mvn clean package -DskipTests

# Etapa 2: Imagem final mais leve
FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

# Copia o JAR gerado na etapa de build
COPY --from=build /app/target/*.jar app.jar

# Expõe a porta padrão do Spring Boot
EXPOSE 8080

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
