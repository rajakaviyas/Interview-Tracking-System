Interview Tracker System (JDBC + MySQL)

📌 Overview
The Interview Tracker System is a console-based Java application developed using JDBC and MySQL to manage company interviews efficiently. It helps users track companies, schedule interviews, and update interview statuses in a structured manner.

🎯 Key Features
➕ Add new companies
📋 View all registered companies
📅 Schedule interviews for companies
📊 Track interview status (Pending / Selected / Rejected)
🔄 Update interview results
🧾 Clean console-based menu system
🔗 MySQL relational database integration

🛠️ Tech Stack
☕ Java (Core Java)
🔗 JDBC (Java Database Connectivity)
🐬 MySQL Database
🧠 IntelliJ IDEA (IDE)

🗄️ Database Design
📌 Companies Table
company_id (Primary Key, Auto Increment)
name
location
website
📌 Interviews Table
interview_id (Primary Key, Auto Increment)
company_id (Foreign Key)
interview_date
role
interview_type
status

🏗️ Project Architecture
src/
 ├── db/            → Database connection class
 ├── dao/           → Database operations (CRUD)
 ├── model/         → POJO classes
 ├── main/          → Main application (menu-driven UI)

🚀 How to Run the Project
Clone the repository:
git clone https://github.com/rajakaviyas/Interview-Tracker-System.git
Import project into IntelliJ IDEA
Add MySQL JDBC Connector:
File → Project Structure → Libraries → Add JAR
Create MySQL database:
CREATE DATABASE interview_tracker;
Run MainApp.java

 📊 Sample Output
 ===== INTERVIEW TRACKER =====
1. Add Company
2. View Companies
3. Schedule Interview
4. View Interviews
5. Update Status
6. Exit

💡 Future Enhancements
🔐 Login system (Admin / Student)
🔍 Search & filter interviews
📈 Dashboard analytics
🌐 Spring Boot REST API version
🖥️ Web-based UI (HTML/CSS/JS)

🏆 Learning Outcomes
JDBC CRUD operations
MySQL relational database handling
DAO design pattern
Console-based application flow
Real-world project structuring

👨‍💻 Author
Rajakaviya S

Java Developer
JDBC & MySQL
Learning Spring Boot

GitHub: https://github.com/rajakaviyas
