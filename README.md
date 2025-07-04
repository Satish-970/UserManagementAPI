<h1 align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&duration=3000&pause=1000&color=1BE2A6&vCenter=true&width=435&lines=User+Management+API+%F0%9F%94%A5;Spring+Boot+REST+API+Project" alt="Typing SVG" />
</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Spring%20Boot-2.7.0-brightgreen?style=for-the-badge&logo=spring-boot" />
  <img src="https://img.shields.io/badge/Java-24-blue?style=for-the-badge&logo=openjdk" />
  <img src="https://img.shields.io/badge/Status-Active-success?style=for-the-badge" />
</p>

---

## 🚀 About the Project

**UserManagementAPI** is a RESTful Spring Boot application that provides operations for managing users. It supports features like pagination, sorting, validation, and a clean JSON-based API.

---

## 🔥 Features

- ✅ Create, Read, Update, Delete (CRUD) users
- ✅ Pagination and sorting
- ✅ Input validation using `@Valid`
- ✅ Exception handling with meaningful responses
- ✅ In-memory H2 Database
- ✅ JUnit & MockMvc test coverage

---

## 📽️ Demo Preview

<p align="center">
  <img src="https://github.com/Satish-970/UserManagementAPI/assets/74038190/efb9fc8d-52c5-4e75-814f-fb48d01d7c26" alt="API Preview" width="90%" />
</p>

---

## 📂 Project Structure

UserManagementAPI/
│
├── controller/ # REST Controllers
├── model/User # Entity models
├── repository/Repository # Spring Data JPA Repositories
├── exception/ # Global exception handling
├── test/Unit Testing# JUnit test cases
└── resources/
├── application.properties


---

## ⚙️ Technologies Used

- Java 24
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven
- JUnit 5 + MockMvc

---

## 📦 API Endpoints

| Method | Endpoint              | Description         |
|--------|-----------------------|---------------------|
| GET    | `/api/users`          | Get all users       |
| GET    | `/api/users/{id}`     | Get user by ID      |
| POST   | `/api/users`          | Create new user     |
| PUT    | `/api/users/{id}`     | Update user         |
| DELETE | `/api/users/{id}`     | Delete user         |

Supports `?page=0&size=5&sort=name,asc` for pagination & sorting.

---

## 🛠️ How to Run

### 🔧 Prerequisites
- Java 17+
- Maven 3+

### 🚀 Steps

```bash
# Clone the repo
git clone https://github.com/Satish-970/UserManagementAPI.git
cd UserManagementAPI

# Build the project
mvn clean install

# Run the app
mvn spring-boot:run


🌐 Postman Collection
You can test endpoints using Postman.
📦 Download Collection (optional: upload your Postman collection JSON here if available)

📊 GitHub Stats
<p align="center"> <img src="https://github-readme-stats.vercel.app/api?username=satish-970&show_icons=true&theme=radical" /> <img src="https://streak-stats.demolab.com?user=satish-970&theme=radical" /> </p>
🤝 Contributing
Contributions are welcome! Please fork the repo and submit a pull request.


📬 Satish Pakalapati


