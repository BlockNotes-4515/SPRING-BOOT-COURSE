<div align="center">
<h1>SPRING-BOOT-COURSE</h1>
</div>

<p align="center">
SPRING-BOOT-COURSE  
<br>
<strong>Building Product Add Functionality For Seller ASE/AASE/SWE/TL/PL</strong>
</p>

<div align="center">
  <img width="140" src="https://user-images.githubusercontent.com/6661165/91657958-61b4fd00-eb00-11ea-9def-dc7ef5367e34.png"  alt="GitHub Profile Trophy"/>
  <h2 align="center">JAVA FULLSTACK DEVELOPMENT PROJETS</h2>
  <p align="center">🏆 SPRINGBOOTS COURSE DEV-SWE</p>
</div>
<div align="center">


[![license](https://img.shields.io/github/license/ryo-ma/github-profile-trophy)](https://github.com/ryo-ma/github-profile-trophy/blob/master/LICENSE)
[![share](https://img.shields.io/twitter/url?style=social&url=https%3A%2F%2Fgithub.com%2Fryo-ma%2Fgithub-profile-trophy)](https://twitter.com/intent/tweet?text=Add%20dynamically%20generated%20GitHub%20Trophy%20on%20your%20readme%0D%0A&url=https%3A%2F%2Fgithub.com%2Fryo-ma%2Fgithub-profile-trophy)

## 📦 Dependency Management

All project dependencies are managed using **Maven**.

If you need to add or update any dependency (for example, while converting a normal Java project to a **Spring Boot** project), please use the official **Maven Repository**.

🔗 **Maven Repository**  
https://mvnrepository.com/

---

<h2>📘 API Documentation – Swagger UI</h2>

<p>
This project integrates <strong>OpenAPI 3</strong> documentation using 
<strong>Springdoc</strong> to provide interactive API exploration and testing capabilities.
</p>

<hr>

<h3>🔎 Accessing Swagger UI</h3>

<p>
After successfully running the application, the Swagger UI can be accessed at:
</p>

<pre>
http://localhost:8080/swagger-ui/index.html#/
</pre>

<p>
If the application runs on a different port (e.g., 5000), update the URL accordingly:
</p>

<pre>
http://localhost:{PORT}/swagger-ui/index.html#/
</pre>

<hr>

<h3>📄 OpenAPI JSON Specification</h3>

<p>
The raw OpenAPI JSON documentation is available at:
</p>

<pre>
http://localhost:8080/v3/api-docs
</pre>

<hr>

<h3>⚙️ Prerequisites</h3>

<ul>
  <li>Java 17 or higher</li>
  <li>Maven installed</li>
  <li>Spring Boot Version: <strong>3.2.5</strong></li>
</ul>

<p><strong>Swagger Dependency Used:</strong></p>

<pre>
&lt;dependency&gt;
    &lt;groupId&gt;org.springdoc&lt;/groupId&gt;
    &lt;artifactId&gt;springdoc-openapi-starter-webmvc-ui&lt;/artifactId&gt;
    &lt;version&gt;2.5.0&lt;/version&gt;
&lt;/dependency&gt;
</pre>

<hr>

<h3>🚀 Running the Application</h3>

<p>Run using Maven:</p>

<pre>
mvn clean install
mvn spring-boot:run
</pre>

<p>Or execute the generated JAR file:</p>

<pre>
java -jar target/your-jar-file-name.jar
</pre>

<hr>

<h3>🔐 Security Configuration Note</h3>

<p>
The following endpoints are publicly accessible:
</p>

<ul>
  <li><code>/v3/api-docs/**</code></li>
  <li><code>/swagger-ui/**</code></li>
</ul>

<p>
All other endpoints require authentication unless explicitly permitted in the security configuration.
</p>

<hr>

<h3>🛠 Troubleshooting</h3>

<ul>
  <li>Ensure the application is running successfully</li>
  <li>Verify the correct port number</li>
  <li>Confirm the Springdoc dependency is included</li>
  <li>Ensure no deprecated <strong>Springfox</strong> dependency is present</li>
</ul>
