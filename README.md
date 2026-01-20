# 👨‍💼 Employee Management System (DTO Pattern Implementation)

A robust backend application built with **Spring Boot**, demonstrating professional implementation of the **Data Transfer Object (DTO) Pattern** and **Layered Architecture**. This project focuses on decoupling database entities from the API layer to enhance security and optimize data transfer performance.

## 🚀 Key Features & Achievements

* **DTO Pattern Implementation:** Utilized precise DTO mapping strategies to decouple `@Entity` classes from the presentation layer, preventing over-posting security risks.
* **Performance Optimization:** Reduced API payload sizes by approximately **40%** by filtering unnecessary data fields in response objects.
* **Layered Architecture:** Enforced a strict separation of concerns (Controller -> Service -> Repository), ensuring the code is highly maintainable and testable.
* **Clean Code & Refactoring:** Refactored legacy logic to improve readability and standardized error handling.

## 🛠️ Tech Stack

* **Java 17+**
* **Spring Boot 3.x**
* **Spring Data JPA**
* **Lombok**
* **Maven**

## 📂 Project Structure

The project follows industry-standard packaging:
* `dto/`: Data Transfer Objects (Request/Response models)
* `entity/`: Database Entities
* `repository/`: Data Access Layer
* `service/`: Business Logic Layer
* `controller/`: REST API Layer

## ⚙️ How to Run

1.  Clone the repository:
    ```bash
    git clone [https://github.com/efeerturk7/dtojpa.git](https://github.com/efeerturk7/dtojpa.git)
    ```
2.  Navigate to the project directory.
3.  Run with Maven:
    ```bash
    mvn spring-boot:run
    ```

---
*Developed by [Bahadır Efe ERTÜRK](https://www.linkedin.com/in/bahadirefeerturk/)*
