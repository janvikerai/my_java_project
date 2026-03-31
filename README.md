# Library Management System - Jhanvi Version

## Project Description
This is a Java-based Library Management System using Object-Oriented Programming (OOP) concepts such as **abstraction**, **inheritance**, and **interfaces**.  

The system allows users to:
- Create and manage **students**, **librarians**, and **books**  
- Issue and return books  
- Store multiple objects using **collections**  
- Save and read data from a file for **persistence**  
- Handle invalid input safely using **exception handling**  

This version includes **dynamic input**, **file storage**, and **collections** for improved functionality.

---

## Features Implemented

### 1. Dynamic Input
- Users can enter student name/ID, book title, and librarian details dynamically through the console.

### 2. Collections
- **ArrayList** is used to store multiple records (students, books, librarians) before saving them to a file.

### 3. File Handling
- Data is automatically saved to `library_data.txt` using `BufferedWriter`.  
- Data is read back from the file using `BufferedReader` to confirm persistence.

### 4. Exception Handling
- `try-catch-finally` blocks are used to:
  - Handle invalid input (e.g., entering letters instead of numbers for IDs)  
  - Handle file read/write errors  
  - Ensure the program ends safely by closing the Scanner  

---

## How to Run

1. Open the terminal/command prompt in your project folder.  
2. Compile all Java files:
```bash
javac *.java
