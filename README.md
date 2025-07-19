# StudentApp

A modern web application to manage student records, built with **Spring Boot**, **Thymeleaf**, and **Oracle Database**. This project demonstrates CRUD operations, search functionality, and a clean, user-friendly interface.

---

## 🚀 Features
- Add, edit, and view student records (ID, Name, Marks)
- Search students by name or ID
- Responsive UI with Bootstrap
- Persistent storage using Oracle DB
- MVC architecture with Spring Boot & Thymeleaf

---

## 🛠️ Tech Stack
- **Backend:** Spring Boot 3.2, Spring Data JPA
- **Frontend:** Thymeleaf, Bootstrap 5
- **Database:** Oracle (ojdbc11)
- **Build Tool:** Maven
- **Java Version:** 17

---

## 📸 Result Images
Add screenshots of your running application here:

![Home Page](src/main/resources/static/result_home.png)
![Edit Student](src/main/resources/static/result_edit.png)

> Place your screenshots in `src/main/resources/static/` and rename them as above for automatic display in this README.

---

## ⚡ Getting Started

### Prerequisites
- Java 17+
- Maven
- Oracle Database (or update datasource in `application.properties`)

### Setup
1. **Clone the repository:**
   ```bash
   git clone <your-repo-url>
   cd studentapp
   ```
2. **Configure Database:**
   - Edit `src/main/resources/application.properties` with your Oracle DB credentials.
3. **Build and Run:**
   ```bash
   ./mvnw spring-boot:run
   ```
4. **Access the App:**
   - Open [http://localhost:8080](http://localhost:8080) in your browser.

---

## 🤝 Contributing
Pull requests are welcome! For major changes, please open an issue first to discuss what you would like to change.

---

## 📄 License
This project is licensed under the MIT License. 
