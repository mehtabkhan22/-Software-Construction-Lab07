
# Lab 07: Construction for Reuse — Interfaces, Generics, and Contracts

## Student Information
- **Name:** Muhammad Mehtab
- **Course:** Software Construction & Development Lab
- **Semester:** 5th Semester
- **Lab Topic:** Construction for Reuse — Interfaces, Generics, and Contracts

## Overview
This lab focuses on important Java concepts that promote code reusability, type safety, flexible design, and maintainable software development. It demonstrates how interfaces, generics, inheritance principles, and comparison mechanisms can be used to build reusable software components.

## Lab Tasks

### Task 1: Black-Box Reuse Using Interfaces and Composition
**Objective:** Understand how interfaces and composition support code reuse and reduce coupling.

**Implementation:**
- Created a `PaymentMethod` interface.
- Implemented the interface using `CreditCardPayment` and `JazzCashPayment`.
- Used an `EcommerceCart` class that accepts a payment method and processes checkout through it.

**Key Learning:** Different payment methods can be used through the same interface without changing the cart's implementation.

### Task 2: Generic Data Types
**Objective:** Understand generics and compile-time type safety in Java.

**Implementation:**
- Created a generic `DataBox<T>` class.
- Stored different data types, such as `String` and `Integer`.
- Used type parameters to make the class reusable for different data types.

**Key Learning:** Generics reduce code duplication and help prevent type-related errors at compile time.

### Task 3: Liskov Substitution Principle (LSP)
**Objective:** Understand the importance of correct inheritance and substitutability.

**Implementation:**
- Examined the relationship between `Rectangle` and `Square`.
- Demonstrated how incompatible subclass behavior can violate the Liskov Substitution Principle.
- Used a common `Shape` interface with separate rectangle and square implementations as a more suitable design.

**Key Learning:** A subtype should be usable wherever its supertype is expected without breaking the program's expected behavior.

### Task 4: Reusable Ordering Algorithms
**Objective:** Understand the difference between internal and external comparison rules.

**Implementation:**
- Created a `Student` class with `rollNo` and `cgpa` attributes.
- Implemented `Comparable<Student>` to sort students by roll number in ascending order.
- Created `CgpaComparator`, implementing `Comparator<Student>`, to sort students by CGPA in descending order.
- Added three students to an `ArrayList` and demonstrated both sorting methods.

**Key Learning:** `Comparable` defines a class's natural ordering, while `Comparator` provides alternative sorting rules without modifying that natural ordering.

## Technologies Used
- **Programming Language:** Java
- **IDE:** NetBeans
- **Build Tool:** Apache Maven
- **Core Concepts:** Interfaces, Composition, Generics, Liskov Substitution Principle, `Comparable`, `Comparator`, `ArrayList`, and Collections

## Overall Conclusion
This lab provided practical experience with reusable software design in Java. Through the four tasks, we learned how interfaces and composition reduce coupling, generics improve type safety, the Liskov Substitution Principle guides correct object-oriented design, and `Comparable` and `Comparator` enable flexible sorting. These concepts help developers create modular, reusable, maintainable, and reliable software applications.

## How to Run
1. Open the project in NetBeans.
2. Ensure the Java source files are in their appropriate packages.
3. Build the Maven project.
4. Run the relevant `Main` class for the task you want to demonstrate.

---
**End of Lab 07**