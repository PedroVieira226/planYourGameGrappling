# 🥋 Plan your game Grappling

Aplicativo mobile voltado para **praticantes de grappling** (Jiu-Jitsu, Wrestling, Judô, etc.) que desejam **acompanhar sua evolução** por meio de **estatísticas, métricas de treino e histórico de desempenho**.

O objetivo do projeto é transformar dados de treino em **informações claras**, ajudando atletas a identificar pontos fortes, fraquezas e evolução ao longo do tempo.

---

## 🚀 Visão Geral

O Grappling Tracker permite que atletas registrem treinos, lutas e resultados, gerando **estatísticas automáticas** como:

- Frequência de treinos  
- Taxa de vitórias e derrotas  
- Finalizações mais utilizadas  
- Tempo médio de luta  
- Evolução ao longo das semanas e meses  

Tudo isso apresentado de forma simples e visual.

---

## 🏗️ Arquitetura

O projeto segue uma arquitetura **full stack**, separando responsabilidades entre frontend, backend e banco de dados.

### 📱 Mobile
- Aplicativo desenvolvido em **Kotlin**
- Consome a API REST do backend
- Interface focada em usabilidade e visualização de dados

### 🌐 Frontend Web (Admin / Dashboard)
- Desenvolvido em **Angular**
- Utilizado para visualização avançada de estatísticas e gerenciamento de dados
- Comunicação via API REST

### ⚙️ Backend
- Desenvolvido com **Spring Boot**
- API REST responsável por:
  - Autenticação e autorização
  - Regras de negócio
  - Processamento de estatísticas
- Arquitetura baseada em camadas (Controller, Service, Repository)

### 🗄️ Banco de Dados
- **PostgreSQL**
- Armazena usuários, treinos, lutas, resultados e métricas históricas

### 🐳 Infraestrutura
- **Docker** e **Docker Compose**
- Padroniza o ambiente de desenvolvimento
- Facilita o deploy e a escalabilidade

---

## 📊 Funcionalidades Principais

- Cadastro e autenticação de usuários  
- Registro de treinos e lutas  
- Armazenamento de resultados e observações  
- Geração automática de estatísticas  
- Acompanhamento da evolução do atleta  
- Dashboard com gráficos e métricas  
- Histórico completo de desempenho  

---

## 🧠 Tecnologias Utilizadas

- Kotlin – Aplicativo mobile  
- Spring Boot – Backend REST  
- PostgreSQL – Banco de dados relacional  
- Angular – Frontend web  
- Docker – Conteinerização  
- Docker Compose – Orquestração de serviços  

---

## ▶️ Como Executar o Projeto

### Pré-requisitos
- Docker  
- Docker Compose  

### Subindo o ambiente
```bash
docker-compose up -d
