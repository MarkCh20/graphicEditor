# Graphic Editor

This project serves as a foundation for a graphic editor that works with various geometric shapes. The program uses object-oriented programming principles, including interfaces, abstract classes, and polymorphism, to create a class hierarchy that supports different shapes.

## Project Description

### Class Hierarchy

1. **Shape** - An abstract base class for all shapes, containing a method to get the name of the shape.
2. **Circle**, **Square**, **Rectangle**, **Triangle**, **Ellipse** - Concrete classes that inherit from `Shape`, each representing a specific geometric shape.
3. **ShapePrinter** - A class that accepts a `Shape` object and prints its name to the console.
4. **Printable** - An interface that defines a method for printing information about a shape.

### Usage

The program creates various shapes (e.g., Circle, Square, Rectangle, Triangle, Ellipse) and passes them to the `ShapePrinter` class, which prints the shape's name using the `getName()` method.

### Implementation Details

1. **Interfaces**:
   - The `Printable` interface defines the contract for any class that implements the `print()` method, ensuring that any class that can print a shape's name follows a common structure. This ensures flexibility and maintainability by decoupling the shape-specific logic from the printing logic.

2. **Abstract Classes**:
   - The `Shape` class is abstract and serves as a base class for all geometric shapes. It includes the abstract method `getName()`, which must be implemented by any subclass to return the name of the specific shape (e.g., "Circle", "Square"). This allows the program to handle different shapes in a uniform way.

3. **Encapsulation**:
   - The fields in the shape classes, like the `name` property in each specific shape class (e.g., `Circle`, `Square`), are private. This encapsulation prevents external classes from modifying the shape's internal state directly. It also provides better control over how data is accessed and modified, ensuring data integrity.

4. **Polymorphism**:
   - Polymorphism is implemented through the `ShapePrinter` class, which can accept any object of type `Shape`. Since all shape classes (like `Circle`, `Square`, `Rectangle`, etc.) inherit from `Shape`, the `ShapePrinter` can work with any specific shape without needing to know its concrete type. This enables the addition of new shape classes without modifying the `ShapePrinter` class, demonstrating the power of polymorphism in object-oriented programming.
