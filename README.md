<div align="center">
<h2>🚗 Ride Share App & 🎓 Grade System</h2>

<img src="https://img.shields.io/badge/Language-Java-red?logo=java&logoColor=white" />
<img src="https://img.shields.io/badge/Type-Console%20Applications-blue" />
<img src="https://img.shields.io/badge/License-MIT-green" />

<p><i>Two interactive Java console-based projects demonstrating clean logic, modular design, and real-world programming concepts ☕</i></p>

<hr>

</div>

---

<div align="center">



<p><i>Smart fare calculation and payment simulation app built with Java ☕</i></p>

<hr>

</div>

<div align="left">

## 🏁 Overview  
The **Ride Share App** simulates ride fare calculations based on distance and time of day, supporting multiple payment methods and discount systems.

</div>

---

<div align="center">

## ✨ Key Features

| Category | Description |
|-----------|--------------|
| 🚕 **Fare Calculation** | Calculates fare based on distance and time |
| 🌞 **Day/Night Mode** | Adjusts fare by hour |
| 💰 **Surcharge System** | +10% for trips over 20 km |
| 🪪 **Membership Discount** | -5% for loyal members |
| 💳 **Payment Options** | Cash, Card, WeChat, Alipay, Membership |
| 🔁 **Multi-Trip Support** | Allows multiple trip calculations |

</div>

---

<div align="center">

## 💸 Fare Rules

| Condition | Description | Effect |
|------------|--------------|---------|
| Distance > 20 km | High Mileage | +10% surcharge |
| Membership | Loyalty User | -5% discount |
| Invalid Input | Validation | Prompts re-entry |

</div>

---

<div align="center">

## 🧱 Main Classes

| Class | Description |
|--------|-------------|
| `rideapp` | Controls input/output and menu navigation |
| `rideshare` | Handles fare logic and payment processing |

</div>

---

<div align="center">

<h1>🎓 Grade System – Java Console Application</h1>

<img src="https://img.shields.io/badge/Language-Java-orange?logo=java&logoColor=white" />
<img src="https://img.shields.io/badge/Type-Console%20App-blue" />
<img src="https://img.shields.io/badge/License-MIT-green" />

<p><i>A simple academic management and grade conversion system built in Java ☕</i></p>

<hr>

</div>

<div align="left">

## 🧠 Overview  
The **Grade System** is a console-based Java project that allows **students** and **teachers** to manage and view grades, calculate averages, and convert numerical grades to letter grades.

</div>

---

<div align="center">

## ✨ Key Features

| 👨‍🎓 Student Features | 👩‍🏫 Teacher Features |
|----------------------|-----------------------|
| 📚 View personal grades | 🧾 View all student grades |
| 🧮 Calculate average | ➕ Add grades to students |
| 🔠 Convert grades | 📘 Display conversion rules |
| 💡 Grade checker | 🧮 Grade validation |

</div>

---

<div align="center">

## 🧮 Grade Conversion Table

| Numeric Range | Letter Grade | Meaning |
|----------------|---------------|----------|
| 70–100 | 🟢 **A** | Excellent |
| 60–69 | 🟡 **B** | Good |
| 50–59 | 🟠 **C** | Average |
| 0–49 | 🔴 **F** | Fail |

</div>

---

<div align="center">

## 🧱 Class Summary

| Class | Description |
|--------|-------------|
| `User` | Handles login and authentication |
| `Student` | Stores student info and grades |
| `Teacher` | Manages subjects and grading |
| `GradeSystem` | Controls menus and overall flow |

</div>

---

<div align="center">

## 🌟 Future Enhancements

| Improvement | Description |
|--------------|--------------|
| 🗃 File or database storage | Save grades permanently |
| 💻 GUI using JavaFX or Swing | Interactive interface |
| 📤 Export grades to CSV/PDF | Easy sharing and backup |
| 🧮 Statistical reports | Show class averages and rankings |
| 🗺 Google Maps API (RideApp) | Real distance-based fare calculation |

</div>

---
<div align="center">

## ⚙️ Installation & Setup

</div>

<div align="left">

<div align="center">

## 🗂️ Project File Structure

</div>



1. **Clone the Repository**
   ```bash
   git clone https://github.com/samiunarno/RideShare-Grade-System-Application-simple.git
   cd src
   javac rideapp.java rideshare.java GradeSystem.java Student.java Teacher.java User.java
   java rideapp
   java GradeSystem

<div align="left">

```bash
📦 src
┣ 🚗 Ride Share App
┃ ┣ 📜 rideapp.java        # Handles input + app flow
┃ ┗ 📜 rideshare.java      # Fare calculation & payment logic
┃
┗ 🎓 src
  ┣ 📜 GradeSystem.java    # Main menu + login system  
  ┣ 📜 User.java           # User authentication base class
  ┣ 📜 Student.java        # Student data & grade operations
  ┣ 📜 Teacher.java        # Teacher actions (grading/management)
  ┗ 📜 README.md





<p align="center">🧡 Developed with Java ☕ by <b>Samiun Mahmud</b></p>
