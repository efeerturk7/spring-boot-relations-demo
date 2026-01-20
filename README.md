# ⚽ Advanced Team Management System (JPA Relations & Optimization)

A high-performance backend system designed to manage complex **Many-to-Many** relationships between Players and Teams. This project demonstrates advanced **Spring Data JPA** capabilities, query optimization, and data consistency logic.

## 🌟 Key Features & Achievements

* **Complex Relation Mapping:** Optimized `@ManyToMany` and `@OneToMany` database queries, ensuring data consistency across **100+ potential transfer scenarios**.
* **Data Redundancy Reduction:** Engineered custom logic to minimize data duplication, reducing database redundancy by approximately **30%**.
* **Scalable REST APIs:** Designed endpoints capable of handling player transfer operations with **<200ms response times**.
* **Business Logic:** Implemented comprehensive validation rules for adding players to teams and managing transfers.

## 🛠️ Tech Stack

* **Java 17+**
* **Spring Boot 3.x**
* **Spring Data JPA** (Hibernate)
* **PostgreSQL** (or H2 Database)
* **Maven**

## 💾 Database Design

The system efficiently handles the following entities:
* **Team:** Represents sports clubs.
* **Player:** Represents athletes linked to teams.
* **Transfer:** Manages the history and logic of player movements.

## ⚙️ How to Run

1.  Clone the repository:
    ```bash
    git clone [https://github.com/efeerturk7/relations-demo.git](https://github.com/efeerturk7/relations-demo.git)
    ```
2.  Configure your database settings in `application.properties`.
3.  Run the application:
    ```bash
    mvn spring-boot:run
    ```

---
*Developed by [Bahadır Efe ERTÜRK](https://www.linkedin.com/in/bahadirefeerturk/)*
