# ClothesShop Console Application

## Introduction
This project is a **console-based** application developed for the **Java OOP** course, serving as an **assignment** to practice fundamental object-oriented programming concepts such as encapsulation, inheritance, polymorphism, and abstraction.

## Overview
The application manages an inventory of clothing and footwear items, providing functionalities to add, remove, update, filter, and apply discounts. The codebase is structured around core OOP principles.

## Requirements
- **Java 8** or newer
- A Java-compatible IDE (VS Code, IntelliJ, Eclipse) or the command line

## Folder Structure
| Folder | Description |
|--------|-------------|
| **src** | Holds the Java source files (classes, enums, etc.) |
| **lib** | Contains any external libraries (if needed) |
| **bin** | Stores compiled `.class` files |

## How to Compile and Run

### Compilation
Open a terminal in the project's root directory and run:
```bash
javac -d bin src/consoleappshop/*.java
```

### Execution
Run the main class with:
```bash
java -cp bin consoleappshop.Main
```

## Main Features
- ✨ **Add a product** (T-shirt, blouse, pants, footwear, etc.)
- 🗑️ **Remove a product** by name
- 📝 **Update** product price and quantity
- 💰 **Apply discounts** (first and second discount)
- 📊 **Generate reports** by category
- 🔍 **Filter products** by name, price, color, size, and quantity
- 📋 **List** all products in the inventory

## Best Practices
- To avoid character encoding issues (especially with diacritics), make sure your files are saved in UTF-8.
- The project is organized to meet the Java OOP course requirements and can be further extended based on future needs.

---

© 2025 Java OOP Course. This project is provided as an assignment to practice the basics of object-oriented programming.