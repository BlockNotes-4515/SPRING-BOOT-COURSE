<div align="center">
  <h1>SPRING-BOOT-COURSE</h1>
</div>

<p align="center">
  SPRING-BOOT-COURSE<br>
  <strong>Building Product Add Functionality For Seller ASE/AASE/SWE/TL/PL</strong>
</p>

<div align="center">
  <img width="140" 
       src="https://user-images.githubusercontent.com/6661165/91657958-61b4fd00-eb00-11ea-9def-dc7ef5367e34.png"  
       alt="Project Logo"/>
  <h2>JAVA FULLSTACK DEVELOPMENT PROJECTS</h2>
  <p>🏆 SPRINGBOOT COURSE DEV-SWE</p>
</div>

<div align="center">

[![license](https://img.shields.io/github/license/ryo-ma/github-profile-trophy)](https://github.com/ryo-ma/github-profile-trophy/blob/master/LICENSE)
[![share](https://img.shields.io/twitter/url?style=social&url=https%3A%2F%2Fgithub.com%2Fryo-ma%2Fgithub-profile-trophy)](https://twitter.com/intent/tweet)

</div>

---

# 📌 Project Overview

This project is built using **Spring Boot 3.2.5** as part of Java Full Stack Development training.  
It demonstrates backend development concepts including REST APIs, authentication, security configuration, and Swagger API documentation.

---

## 📦 Dependency Management

All project dependencies are managed using **Maven**.

If you need to add or update any dependency (for example, while converting a normal Java project to a Spring Boot project), please use the official Maven Repository:

🔗 https://mvnrepository.com/

---

# 📘 API Documentation – Swagger UI

This project integrates **OpenAPI 3** documentation using Springdoc for interactive API exploration and testing.

---

## 🔎 Accessing Swagger UI

After successfully running the application, access Swagger UI at:

```
http://localhost:8080/swagger-ui/index.html#/
```

If running on a different port:

```
http://localhost:{PORT}/swagger-ui/index.html#/
```

---

## 📄 OpenAPI JSON Specification

Raw API documentation:

```
http://localhost:8080/v3/api-docs
```

---

## ⚙️ Prerequisites

- Java 17 or higher  
- Maven installed  
- Spring Boot Version: 3.2.5  

---

## 🧩 Swagger Dependency Used

```xml
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.5.0</version>
</dependency>
```

---

## 🚀 Running the Application

Using Maven:

```bash
mvn clean install
mvn spring-boot:run
```

Or using the generated JAR file:

```bash
java -jar target/your-jar-file-name.jar
```

---

## 🔐 Security Configuration

The following endpoints are publicly accessible:

- `/v3/api-docs/**`
- `/swagger-ui/**`

All other APIs require authentication unless explicitly permitted in the security configuration.

---

## 🛠 Troubleshooting

If Swagger UI does not open:

- Ensure the application is running successfully
- Verify the correct port number
- Confirm the Springdoc dependency is included
- Remove any deprecated Springfox dependency
- Run `mvn clean install` before starting

---

# 🏗 Tech Stack

- Java 17  
- Spring Boot 3.2.5  
- Spring Security  
- Maven  
- OpenAPI (Springdoc)  
- H2 / MySQL (based on configuration)

---

# 📂 Project Structure (Sample)

```
src/
 ├── main/
 │    ├── java/
 │    │    └── com.ecommerce.project
 │    ├── resources/
 │    │    ├── application.properties
 │    │    └── static/
 │    └── test/
```

---

# 👨‍💻 Author

Developed as part of Java Full Stack Development learning and backend engineering practice.

---
<div style="
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100vh;
">
  <img 
    src="https://user-images.githubusercontent.com/74038190/212284136-03988914-d899-44b4-b1d9-4eeccf656e44.gif" 
    alt="centered GIF"
    style="max-width: 100%; height: auto;"
  >
</div>
<hr>
