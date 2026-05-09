# 🛒 E-Commerce Application

A production-ready e-commerce backend built with **Java**, **Spring Boot**, and **MySQL**, featuring cart management, order processing, and RESTful APIs.

---

## 🚀 Tech Stack

| Layer | Technology |
|---|---|
| Language | Java 22 |
| Framework | Spring Boot 4.0.6 |
| Database | MySQL 8.0 |
| ORM | Hibernate / Spring Data JPA |
| Security | JWT Authentication |
| Build Tool | Maven |
| Monitoring | Spring Boot Actuator |

---

## 📦 Features

- ✅ User management with role-based access
- ✅ Product catalog with stock management
- ✅ Cart operations (add, update, remove, clear)
- ✅ Order creation from cart with subtotal calculation
- ✅ RESTful APIs with proper HTTP status codes
- ✅ Health monitoring via Actuator endpoints

---

## 🗂️ Project Structure

```
src/
├── controller/       # REST API controllers
├── service/          # Business logic
├── repository/       # Spring Data JPA repositories
├── model/            # JPA entities
├── dto/              # Request/Response DTOs
└── EcomApplication.java
```

---

## ⚙️ Getting Started

### Prerequisites
- Java 22+
- MySQL 8.0+
- Maven 3.8+

### 1. Clone the repository
```bash
git clone https://github.com/your-username/ecom-application.git
cd ecom-application
```

### 2. Configure the database
Create a MySQL database:
```sql
CREATE DATABASE ecom_db;
```

Copy the example properties file and update with your credentials:
```bash
cp src/main/resources/application.properties.example src/main/resources/application.properties
```

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecom_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

### 3. Run the application
```bash
mvn spring-boot:run
```

App runs on `http://localhost:8080`

---

## 📡 API Endpoints

### Cart
| Method | Endpoint | Description |
|---|---|---|
| POST | `/api/cart` | Add item to cart |
| GET | `/api/cart` | Get cart items |
| DELETE | `/api/cart/items/{productId}` | Remove item from cart |
| DELETE | `/api/cart/clear` | Clear entire cart |

### Orders
| Method | Endpoint | Description |
|---|---|---|
| POST | `/api/orders` | Create order from cart |
| GET | `/api/orders` | Get all orders |

### Actuator
| Endpoint | Description |
|---|---|
| `/actuator/health` | App & DB health status |
| `/actuator/metrics` | JVM & HTTP metrics |
| `/actuator/mappings` | All registered routes |

> All endpoints require `X-User-ID` header for user identification.

---

## 🔧 Configuration

| Property | Description | Default |
|---|---|---|
| `server.port` | App port | `8080` |
| `spring.jpa.hibernate.ddl-auto` | Schema strategy | `update` |
| `management.endpoints.web.exposure.include` | Actuator exposure | `*` |

---

## 📊 Monitoring

Once running, check app health at:
```
GET http://localhost:8080/actuator/health
```

Expected response:
```json
{
    "status": "UP",
    "components": {
        "db": { "status": "UP" },
        "diskSpace": { "status": "UP" }
    }
}
```

---

## 🙋‍♂️ Author

**Islavath Praveen Naik**  
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Connect-blue)](https://linkedin.com/in/your-profile)
[![GitHub](https://img.shields.io/badge/GitHub-Follow-black)](https://github.com/your-username)

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).
