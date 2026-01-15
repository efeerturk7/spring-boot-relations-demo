# Spring Boot Relations & DTO Pattern Demo 🚀

Bu proje, kurumsal backend mimarilerinde kullanılan **Best Practices** (En İyi Uygulamalar) temel alınarak geliştirilmiş bir Spring Boot REST API örneğidir.

Projenin temel amacı; Entity ve DTO (Data Transfer Object) ayrımını net bir şekilde uygulamak, JPA ile veritabanı ilişkilerini (One-to-Many) yönetmek ve güvenli veri transferi sağlamaktır.

## 🛠️ Kullanılan Teknolojiler
* **Java 17+**
* **Spring Boot 3.x**
* **Spring Data JPA (Hibernate)**
* **PostgreSQL Database**
* **Lombok**
* **Maven**

## 🌟 Proje Özellikleri ve Mimarisi
* **Layered Architecture:** Controller, Service, Repository ve Entity katmanları ayrılmıştır.
* **DTO Pattern:** Veritabanı nesneleri (Entity) doğrudan dışarıya açılmamış, Request ve Response için özel DTO sınıfları (IU/Response) kullanılmıştır.
* **JPA Relations (One-to-Many):** `Team` (Takım) ve `Player` (Oyuncu) arasındaki ilişki, Cascade tipleri ve Fetch stratejileri gözetilerek kurulmuştur.
* **CRUD Operasyonları:** Ekleme, Silme, Güncelleme ve Listeleme işlemleri tam kapsamlıdır.
* **Transfer Logic:** Oyuncuların takım değiştirebilmesi için özel iş mantığı (Business Logic) geliştirilmiştir.

## 🔗 Endpoints (Örnekler)
* `POST /saveTeam`: Yeni takım oluşturur.
* `POST /addPlayer/{team_id}`: Belirtilen takıma yeni oyuncu ekler.
* `PUT /updatePlayer/{id}`: Oyuncu bilgilerini günceller veya transfer eder.
* `GET /getAllTeams`: Tüm takımları ve oyuncularını listeler.
