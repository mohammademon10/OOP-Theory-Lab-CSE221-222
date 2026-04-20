<div align="center">

# 🎓 Object-Oriented Programming Repository
## CSE221 & CSE222 - Complete Implementation in C++ & Java

[![C++](https://img.shields.io/badge/C%2B%2B-11-blue?style=for-the-badge&logo=cplusplus)](https://en.wikipedia.org/wiki/C%2B%2B)
[![Java](https://img.shields.io/badge/Java-8-orange?style=for-the-badge&logo=java)](https://www.java.com/)
[![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)](LICENSE)
[![Status](https://img.shields.io/badge/Status-Active-success?style=for-the-badge)](https://github.com)
[![PRs Welcome](https://img.shields.io/badge/PRs-Welcome-brightgreen?style=for-the-badge)](CONTRIBUTING.md)

*A comprehensive learning repository demonstrating Object-Oriented Programming principles through practical implementations and real-world projects.*

---

### 🔗 Quick Navigation
[📋 Overview](#overview) • [✨ Features](#features) • [🛠️ Tech Stack](#tech-stack) • [📁 Structure](#project-structure) • [🚀 Getting Started](#getting-started) • [💻 Examples](#example-output) • [📚 Learning Outcomes](#what-i-learned) • [👤 Author](#author)

---

</div>

## 📋 Overview

This repository contains a **complete collection of Object-Oriented Programming (OOP) examples and real-world projects** developed during the CSE221 (Theoretical) and CSE222 (Laboratory) courses. The implementations showcase fundamental and advanced OOP concepts through practical, well-documented code examples in both **C++ and Java**.

Whether you're learning OOP for the first time or looking to strengthen your understanding, this repository serves as a **comprehensive resource** for:
- Understanding class design and object creation
- Mastering inheritance and polymorphism
- Implementing encapsulation and data hiding
- Building real-world applications using OOP principles

---

## ✨ Features

| Feature | Description | Example |
|---------|-------------|---------|
| 🏛️ **Classes & Objects** | Comprehensive class design patterns | `Customer.java`, `Shape.cpp` |
| 🔨 **Constructors** | Multiple constructor types and implementations | `constructor.cpp`, `copy_type_constructor.cpp` |
| 📦 **Encapsulation** | Data hiding and access control | `encaptulation.cpp`, `StudentMain.java` |
| 🔗 **Associations** | Object relationships and compositions | `Association/`, `ProjectHouse/` |
| 🌳 **Inheritance** | Class hierarchies and polymorphism | `Lab_03/`, `OnlineShopping/` |
| 🏗️ **Real Projects** | Practical applications | `CampusLibrary/`, `StuentRegDemo/` |
| 📝 **Well-Documented** | Clean, commented code for learning | All source files |
| ⚡ **Easy to Learn** | Beginner to intermediate level examples | Progressive complexity |

---

## 🛠️ Tech Stack

<div align="center">

| Category | Technologies |
|----------|-------------|
| **Languages** | ![C++](https://img.shields.io/badge/-C%2B%2B-00599C?style=flat-square&logo=cplusplus) ![Java](https://img.shields.io/badge/-Java-007396?style=flat-square&logo=java) |
| **Compilers** | `g++`, `clang++`, `javac` |
| **IDEs** | IntelliJ IDEA, Visual Studio Code, Eclipse |
| **Java Version** | JDK 8+ |
| **C++ Standard** | C++11 |
| **Build Tools** | Maven (Java projects) |

</div>

---

## 📁 Project Structure

### 📑 Legend
| Symbol | Meaning | Description |
|--------|---------|-------------|
| 📄 | File | Single source or configuration file |
| 🗂️ | Directory | Folder containing multiple files |
| 📦 | Package/Module | Project with multiple classes |
| 💾 | Config | Configuration file (.iml, .xml, etc.) |

### 📂 Complete Directory Tree

```
OOP-Theory-Lab-CSE221-222/                     [ROOT DIRECTORY]
│
├── 📄 README.md                                # Project documentation & guide
├── 📄 LICENSE                                  # MIT License file
│
│
├── 🗂️ OOP_C++/                                # C++ Examples (8 files)
│   │                                          # Focus: Basic OOP concepts
│   ├── 01_create class.cpp                    # Creating basic classes
│   ├── 02_create_Class&Object.cpp             # Class instantiation & objects
│   ├── 03_create_class_with_SomeAttributes.cpp # Classes with properties
│   ├── constructor.cpp                        # Constructor patterns
│   ├── constructor_01.cpp                     # Parameterized constructors
│   ├── copy_type_constructor.cpp              # Copy constructors & deep copy
│   ├── encaptulation.cpp                      # Data hiding & encapsulation
│   └── oops.cpp                               # General OOP principles
│
│
├── 🗂️ OOP_JAVA/                               # Java Projects (Main Directory)
│   │
│   ├── 📄 HelloWorld.java                     # Basic Java program
│   ├── 📄 objTest.java                        # Object testing examples
│   ├── 💾 OOP_JAVA.iml                        # IntelliJ project config
│   │
│   │
│   ├── 📦 Association/                        # Association Patterns (5 classes)
│   │   ├── 💾 Association.iml
│   │   └── src/
│   │       ├── Circle.java                    # Circular shape class
│   │       ├── Rectangle.java                 # Rectangular shape class
│   │       ├── Square.java                    # Square shape class
│   │       ├── Rombus.java                    # Rhombus shape class
│   │       ├── Star.java                      # Star shape class
│   │       └── Main.java                      # Driver program
│   │
│   │
│   ├── 📦 Association_00/                     # Basic Associations (3 classes)
│   │   ├── 💾 Association_00.iml
│   │   └── src/
│   │       ├── Circle.java                    # Circle implementation
│   │       ├── Square1.java                   # First square variant
│   │       ├── Square2.java                   # Second square variant
│   │       └── Main.java                      # Entry point
│   │
│   │
│   ├── 📦 CampusLibrary/                      # Library Management System
│   │   │                                      # Type: Real-world Application
│   │   ├── 💾 CampusLibrary.iml
│   │   └── src/
│   │       ├── Book.java                      # Book entity class
│   │       ├── Library.java                   # Library management logic
│   │       └── Main.java                      # System entry point
│   │
│   │
│   ├── 📦 CSE222_LAb/                         # Lab Exercises (7 files)
│   │   │                                      # Type: Course assignments
│   │   ├── Circle.java                        # Circle shape implementation
│   │   ├── Hello.java                         # Hello world variant
│   │   ├── labday1.java                       # Day 1 lab assignment
│   │   ├── Shape.java                         # Shape base class
│   │   ├── Shape2.java                        # Extended shape class
│   │   ├── Student.java                       # Student class
│   │   ├── StudentMain.java                   # Student program
│   │   └── Teacher.java                       # Teacher class
│   │
│   │
│   ├── 📦 Lab_03/                             # Lab Session 3 (3 classes)
│   │   │                                      # Type: Geometry exercises
│   │   ├── Circle.java                        # Circle implementation
│   │   ├── Rectangular.java                   # Rectangle class
│   │   ├── Star.java                          # Star shape class
│   │   └── Main.java                          # Test driver
│   │
│   │
│   ├── 📦 OnlineShopping/                     # E-Commerce System ⭐
│   │   │                                      # Type: Complex real-world app
│   │   ├── 💾 OnlineShopping.iml              # (4 core classes + Main)
│   │   └── src/
│   │       ├── Customer.java                  # Customer profile management
│   │       ├── Item.java                      # Product inventory class
│   │       ├── Buy.java                       # Purchase transaction class
│   │       └── Main.java                      # E-commerce system entry
│   │
│   │
│   ├── 📦 ProjectHouse/                       # House Construction Project ⭐
│   │   │                                      # Type: Composition pattern demo
│   │   ├── 💾 ProjectHouse.iml
│   │   └── src/
│   │       ├── House.java                     # Main house class (composite)
│   │       ├── Door.java                      # Door component
│   │       ├── Window.java                    # Window component
│   │       └── Main.java                      # House builder program
│   │
│   │
│   ├── 📦 StuentRegDemo/                      # Student Registration System ⭐
│   │   │                                      # Type: Database-like system
│   │   ├── 💾 StuentRegDemo.iml
│   │   └── src/
│   │       ├── Student.java                   # Student profile class
│   │       ├── Course.java                    # Course information class
│   │       ├── Register.java                  # Registration logic
│   │       └── Main.java                      # Registration entry point
│   │
│   │
│   └── 📂 src/                                # Additional Source Files
│       ├── 📄 Main.java                       # Utility main class
│       ├── 💾 OOP_JAVA.iml
│       ├── 📂 CSE222_LAb/                     # Lab duplicates
│       ├── 📂 lab_04/                         # Lab session 4
│       │   ├── Cube.java                      # 3D cube class
│       │   ├── Data.java                      # Data container
│       │   └── Square.java                    # 2D square class
│       └── [Other lab files]
│
│
├── 🗂️ Customer/                               # Customer Management Module
│   ├── 💾 Customer.iml
│   └── src/
│       ├── Customer.java                      # Customer class implementation
│       └── Main.java                          # Customer demo program
│
│
├── 🗂️ Student/                                # Student Management Module
│   ├── 💾 Student.iml
│   └── src/
│       ├── Student.java                       # Student entity class
│       └── Main.java                          # Student test program
│
│
└── 🗂️ TeacherStudentInfo/                    # Teacher-Student Relationships
    ├── 💾 TeacherStudentInfo.iml
    └── src/
        ├── Teacher.java                       # Teacher entity class
        ├── Student.java                       # Student entity class
        └── Main.java                          # Relationship demo

```

### 📊 Project Statistics

| Category | Count | Details |
|----------|-------|---------|
| **C++ Files** | 8 | Basic OOP concepts & patterns |
| **Java Packages** | 9 | Projects with multiple classes |
| **Java Classes** | 40+ | Core implementations |
| **Lab Assignments** | 4 | CSE222 course labs |
| **Real Projects** | 4 | Production-like applications |
| **Total Lines of Code** | 5000+ | Estimated across all files |

### 🎯 Project Classification

#### **Beginner Level** 🌱
- `OOP_C++/` - Basic class creation and constructors
- `OOP_JAVA/Association/` - Introduction to associations
- `OOP_JAVA/CSE222_LAb/` - Course exercises

#### **Intermediate Level** 📈
- `OOP_JAVA/Lab_03/` - Geometry shape implementations
- `OOP_JAVA/CampusLibrary/` - System design patterns
- `OOP_JAVA/StuentRegDemo/` - Complex data relationships

#### **Advanced Level** 🚀
- `OOP_JAVA/OnlineShopping/` - E-commerce system
- `OOP_JAVA/ProjectHouse/` - Composition & aggregation
- `Customer/`, `Student/`, `TeacherStudentInfo/` - Advanced patterns

---

## 🚀 Getting Started

### 📋 Prerequisites

| Tool | Version | Installation |
|------|---------|--------------|
| **C++ Compiler** | G++ / Clang++ | [Install Guide](https://en.wikipedia.org/wiki/G%2B%2B) |
| **Java Development Kit** | JDK 8+ | [Download JDK](https://www.oracle.com/java/technologies/downloads/) |
| **Git** | Latest | [Install Git](https://git-scm.com/) |

### 📥 Installation

```bash
# Clone the repository
git clone https://github.com/yourusername/OOP-Theory-Lab-CSE221-222.git

# Navigate to project directory
cd OOP-Theory-Lab-CSE221-222
```

### 🔨 Building & Running

#### **C++ Examples**

```bash
# Navigate to C++ directory
cd OOP_C++

# Compile a single file
g++ -o output_name filename.cpp

# Run the compiled program
./output_name
```

**Example:**
```bash
g++ -o encapsulation encaptulation.cpp
./encapsulation
```

#### **Java Examples**

```bash
# Navigate to Java directory
cd OOP_JAVA

# Compile Java file
javac filename.java

# Run the program
java filename
```

**Example (with Maven project):**
```bash
cd OnlineShopping
javac -d bin src/*.java
java -cp bin Main
```

---

## 📂 Project Highlights

### 🏗️ Real-World Applications

#### **1. Campus Library Management** 📚
*Location: `OOP_JAVA/CampusLibrary/`*
- Demonstrates library system with books and management
- Shows effective use of classes and associations
- Real-world applicable design patterns

#### **2. Online Shopping System** 🛒
*Location: `OOP_JAVA/OnlineShopping/`*
- Complete e-commerce implementation
- Customer, Item, and Purchase management
- Order processing and inventory handling

#### **3. Student Registration System** 🎓
*Location: `OOP_JAVA/StuentRegDemo/`*
- Student enrollment and course management
- Registration workflow implementation
- Data persistence patterns

#### **4. House Construction Project** 🏠
*Location: `OOP_JAVA/ProjectHouse/`*
- Composite design pattern demonstration
- House composition with doors and windows
- Real-world object relationships

---

## 💻 Example Output

### C++ Program Output
```
$ g++ -o encapsulation encaptulation.cpp
$ ./encapsulation

=== Encapsulation Demonstration ===
Creating Student object...
Name: John Doe
Roll: 101
Age: 20

=== Data Access Control ===
Using getter: 20
Using setter: Updating age to 21
Updated Age: 21
```

### Java Program Output
```
$ cd OnlineShopping
$ javac -d bin src/*.java
$ java -cp bin Main

=== Online Shopping System ===
Customer: Ahmed Khan
Available Items:
  1. Laptop - $1200
  2. Mouse - $25
  3. Keyboard - $75

Processing Order...
Order Confirmed!
Total: $1300
```

---

## 📚 Course Information

| Course Code | Course Title | Credits | Section | Instructor | Term |
|---|---|---|---|---|---|
| **CSE221** | Object Oriented Programming | 3.0 | 66_A | Prof. Dr. Syed Akhter Hossain | Summer 2025 |
| **CSE222** | Object Oriented Programming Lab | 1.5 | 66_A1 | Prof. Dr. Syed Akhter Hossain | Summer 2025 |

**Total Credits:** 4.5  
**Department:** Department of Computer Science and Engineering  
**Institution:** BRAC University

---

## 🧠 What I Learned

### **Core OOP Concepts** 🎯
- ✅ **Classes and Objects**: Creating blueprints and instances
- ✅ **Constructors & Destructors**: Initialization and cleanup
- ✅ **Encapsulation**: Data hiding and access control (getters/setters)
- ✅ **Inheritance**: Code reuse through class hierarchies
- ✅ **Polymorphism**: Method overriding and dynamic dispatch

### **Design Patterns** 🏗️
- ✅ **Composition**: Building complex objects from simpler ones
- ✅ **Association**: One-to-One, One-to-Many relationships
- ✅ **Abstraction**: Defining contracts through interfaces
- ✅ **Aggregation**: Flexible object combinations

### **Advanced Concepts** 🚀
- ✅ **Copy Constructors**: Deep and shallow copying
- ✅ **Static Members**: Class-level data and methods
- ✅ **Abstract Classes**: Defining abstract behavior
- ✅ **Real-World Modeling**: Translating requirements to code

### **Best Practices** 📖
- ✅ Clean code structure and organization
- ✅ Proper documentation and comments
- ✅ Meaningful naming conventions
- ✅ Single Responsibility Principle
- ✅ Object-oriented design principles (SOLID)

---

## 🤝 Contributing

Contributions are welcome! Whether it's bug fixes, new examples, or improvements:

1. **Fork** the repository
2. **Create** a feature branch (`git checkout -b feature/NewFeature`)
3. **Commit** your changes (`git commit -m 'Add NewFeature'`)
4. **Push** to the branch (`git push origin feature/NewFeature`)
5. **Open** a Pull Request

### 📋 Contribution Guidelines
- Follow existing code style and conventions
- Add comments for complex logic
- Test your code before submitting
- Update README if adding new sections

---

## 📄 License

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.

```
MIT License

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, and/or sell copies of the
Software, and to permit persons to whom the Software is furnished to do so,
subject to the following conditions stated in the license.
```

---

## 👤 Author & Contact

<div align="center">

| Information | Details |
|---|---|
| **Repository** | OOP-Theory-Lab-CSE221-222 |
| **Type** | Educational & Portfolio |
| **Status** | ✅ Active & Maintained |
| **Last Updated** | April 2026 |
| **Course** | CSE221 & CSE222 |
| **University** | BRAC University |

### 🔗 Connect & Follow
- 🐙 **GitHub**: [yourusername](https://github.com/yourusername)
- 📧 **Email**: your.email@bracu.ac.bd
- 💼 **LinkedIn**: [Your LinkedIn](https://linkedin.com/in/yourprofile)
- 🌐 **Portfolio**: [Your Website](https://yourwebsite.com)

</div>

---

<div align="center">

### ⭐ If this repository helped you, please consider starring it!

**Made with ❤️ for learning and open-source contribution**

[⬆ Back to Top](#object-oriented-programming-repository)

</div>