# Interview Tracker System (JDBC + MySQL)

## 📌 Overview

The **Interview Tracker System** is a console-based Java application developed using **JDBC and MySQL** to manage company interviews efficiently. It helps users track companies, schedule interviews, and update interview statuses in a structured manner.

## 🎯 Key Features

* ➕ Add new companies
* 📋 View all registered companies
* 📅 Schedule interviews for companies
* 📊 Track interview status (Pending / Selected / Rejected)
* 🔄 Update interview results
* 🧾 Clean console-based menu system
* 🔗 MySQL relational database integration

## 🛠️ Tech Stack

* ☕ Java (Core Java)
* 🔗 JDBC (Java Database Connectivity)
* 🐬 MySQL Database
* 🧠 IntelliJ IDEA

## 🗄️ Database Design

### Companies Table

* company_id (Primary Key, Auto Increment)
* name
* location
* website

### Interviews Table

* interview_id (Primary Key, Auto Increment)
* company_id (Foreign Key)
* interview_date
* role
* interview_type
* status

## 🏗️ Project Architecture

```text
src/
├── db/
├── dao/
├── model/
└── main/
```

## 🚀 How to Run

1. Clone the repository

```bash
git clone https://github.com/rajakaviyas/Interview-Tracking-System.git
```

2. Open in IntelliJ IDEA
3. Add MySQL Connector JAR
4. Create database:

```sql
CREATE DATABASE interview_tracker;
```

5. Run MainApp.java

## 📊 Sample Output

```text
===== INTERVIEW TRACKER =====
1. Add Company
2. View Companies
3. Schedule Interview
4. View Interviews
5. Update Status
6. Exit
```

## 💡 Future Enhancements

* Login System
* Search & Filter Interviews
* Dashboard Analytics
* Spring Boot REST API
* Web UI

## 🏆 Learning Outcomes

* JDBC CRUD Operations
* MySQL Database Handling
* DAO Design Pattern
* Java Console Application Development

## 👨‍💻 Author

**Rajakaviya S**

* Java Developer
* JDBC & MySQL
* Learning Spring Boot

GitHub: https://github.com/rajakaviyas
