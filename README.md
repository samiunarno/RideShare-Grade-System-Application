🎓 Grade System – Java Console Application

A simple Java-based Grade Management System that allows students, teachers, and administrators to interact with grades through a console interface.
The system supports login authentication, grade management, automatic letter grade conversion, and interactive grade checking.

🧩 Features
👨‍🎓 Student Features

Login as Student

View all personal grades

Calculate and display average grade

Automatically convert numerical grades to letter grades (A–F)

Interactive grade conversion checker

👩‍🏫 Teacher Features

Login as Teacher

View all students and their grades

Add or update student grades

Display grade conversion rules

Use the grade conversion checker

🛠 Admin / System

Preloaded demo data for students, teachers, and admin users

Letter grade conversion system:

70–100 : A  
60–69  : B  
50–59  : C  
0–49   : F  
Other  : Invalid Grade


Input validation and safe scanner handling

🧮 Grade Conversion Rules
Numeric Range	Letter Grade
70–100	A
60–69	B
50–59	C
0–49	F

Example:

95.0 -> A  
67.5 -> B  
55.0 -> C  
42.0 -> F  

🗂️ Project Structure
📦 GradeSystem
 ┣ 📜 GradeSystem.java
 ┣ 📜 User.java
 ┣ 📜 Student.java
 ┣ 📜 Teacher.java
 ┗ 📜 (Optional) README.md

🚀 Getting Started
✅ Prerequisites

Java JDK 8 or higher

Any Java IDE (e.g., IntelliJ IDEA, Eclipse, VS Code with Java extensions)

Basic command-line knowledge (for running from terminal)

🖥️ Run in Command Line

Clone this repository:

git clone https://github.com/yourusername/GradeSystem.git
cd GradeSystem


Compile the program:

javac GradeSystem.java User.java Student.java Teacher.java


Run the program:

java GradeSystem

👤 Demo Login Credentials
Role	Username	Password
Student	student1	12345
Teacher	teacher1	11111
Admin	admin	12345
🧱 Classes Overview
🧍‍♂️ User

Base class for all users, handles login and role management.

🎓 Student

Stores ID, name, and grades

Supports grade viewing and average calculation

👩‍🏫 Teacher

Stores ID, name, and subjects

Can view or add student grades

🧮 GradeSystem

Controls system flow

Handles login, menus, grade conversions, and validation

📸 Example Output
=== Welcome to the Grade System ===
Username: student1
Password: 12345
Login Successful! Welcome student

Student Dashboard
1. View My Grades
2. Calculate Average Grades
3. View Grades with Letter Conversion
4. Grade Conversion Checker
5. Logout
Choose an Option:

📜 License

This project is released under the MIT License – free to use, modify, and distribute.