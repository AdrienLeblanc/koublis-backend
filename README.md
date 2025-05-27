# Koublis API

## Overview
Backend application for wine-related services.

## 1. Technical Specifications

### 1.1. Core Technologies
- **Java Version**: 21
- **Framework**: Spring Boot 3.4.4
- **Package Type**: JAR
- **Entry Point**: `com.koublis.Application`

### 1.2. Core Dependencies

#### Spring Boot Starters
- Spring Boot Web
- Spring Boot Security
- Spring Boot Data JPA
- Spring Boot Data Elasticsearch
- Spring Boot Validation

#### Database
- MySQL (with mysql-connector-j)
- Flyway for database migrations

#### API Documentation
- SpringDoc OpenAPI UI (v2.8.8)

#### Security
- JWT (jjwt v0.12.6)

#### Development Tools
- Lombok (v1.18.38)
- Jackson Databind (v2.18.3)

#### Logging
- Logstash Logback Encoder (v7.4)

#### Testing
- Spring Boot Starter Test
- Testcontainers (v1.21.0)
    - MySQL support
    - Elasticsearch support
- Karate for integration testing (v1.5.1)

### 1.3. Build Features

#### API Client Generation
- Automatic TypeScript/Angular client generation
- OpenAPI Generator configuration
    - Angular version: 19.0.2
    - RxJS version: 7.8.0
    - npm package name: @koublis/api-client
    - Package version: 1.0.0

#### Test Structure
- Unit tests: `src/test`
- Integration tests: `src/it`

### 1.4. Build Pipeline
1. Java compilation
2. Unit tests execution
3. OpenAPI documentation generation
4. TypeScript client generation
5. npm package build
6. Package publishing to local npm registry (http://localhost:4873)

### 1.5. Main Maven Commands

Full build with tests
: `mvn clean install`

Build without tests
: `mvn clean install -DskipTests`

Run tests only
: `mvn test`

Generate TypeScript client
: `mvn verify`


### 1.6. Prerequisites
- JDK 21
- Maven
- MySQL
- Elasticsearch
- Node.js and npm (for API client generation)
- Local npm registry (verdaccio recommended)

## 2. Deployment Notes
- Application is packaged as a single JAR
- Local npm registry port: 4873
- Database migrations are handled automatically by Flyway

