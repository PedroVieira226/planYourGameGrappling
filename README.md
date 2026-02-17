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


```
---

# Requisitos funcionais
## 1. Gestão de Usuários e Acesso (Autenticação)
- RF01 - Cadastro de Usuário: O sistema deve permitir que novos usuários se cadastrem informando nome, username, e-mail, senha e perfil (Aluno ou Professor).

- RF02 - Autenticação: O sistema deve permitir o login de usuários via e-mail/username e senha, retornando um token seguro (JWT).

- RF03 - Controle de Perfil (Roles): O sistema deve restringir funcionalidades com base no perfil (Exemplo: Apenas "Professores" podem criar turmas).

- RF04 - Gestão de Perfil: O usuário deve poder visualizar e editar seus dados básicos e imagem de perfil.

## 2. Gestão de Treinos e Sessões
- RF05 - Registro de Sessão: O aluno deve poder registrar uma nova sessão de treino (ex: data, duração, tipo de treino).

- RF06 - Feedback de Treino: Após a sessão, o aluno deve poder registrar um feedback qualitativo contendo pontos positivos, negativos e observações gerais.

- RF07 - Histórico de Sessões: O sistema deve listar cronologicamente as sessões realizadas pelo usuário autenticado.

- RF08 - Exclusão de Sessões: O usuário deve poder remover registros de treinos feitos por engano.

## 3. Desenvolvimento de Habilidades (Skills)
- RF09 - Catálogo de Habilidades: O sistema deve manter um cadastro de habilidades técnicas (ex: Passagem de guarda, Finalizações).

- RF10 - Avaliação de Progresso: O sistema deve permitir que o usuário atribua uma nota de 1 a 5 para o seu desempenho em habilidades específicas dentro de uma sessão de treino.

- RF11 - Monitoramento de Evolução: O sistema deve registrar o histórico de notas para permitir a visualização da evolução técnica ao longo do tempo.

## 4. Estatísticas e Dashboard
- RF12 - Resumo de Atividades: O sistema deve exibir o total de sessões realizadas.

- RF13 - Métricas Temporais: O sistema deve calcular e exibir a quantidade de treinos por semana e por mês.

- RF14 - Análise por Habilidade: O sistema deve gerar uma visualização agregada do nível atual do usuário em cada habilidade treinada.

## 5. Gestão de Turmas (Módulo Professor)
- RF15 - Criação de Turmas: O professor deve poder criar turmas e nomeá-las.

- RF16 - Vinculação de Alunos: O professor deve poder adicionar alunos às suas turmas.

- RF17 - Acompanhamento de Alunos: O professor deve poder visualizar a lista de alunos de sua turma e acessar o progresso individual de cada um para dar orientações.
