# Matrixnator: A Simple Java Matrix Printing API

A lightweight and clean Java library for elegantly printing formatted matrices to the console. The goal of **Matrixnator** is to provide a reusable and DRY (Don't Repeat Yourself) API for visualizing two-dimensional data structures in a clear way, aiding in application development and debugging.

This project was created as part of my Java studies and personal growth as a developer.

---

### Features 🚀

-   **Matrix Printing:** Native support for `float`, `double`, and `int` matrices.
-   **Centered Alignment:** All values are automatically centered within their cells for a professional aesthetic.
-   **Grid Structure:** Uses Unicode characters to draw borders and grids, providing a clear visual representation of the matrix structure.
-   **Simple API:** The API interface is intuitive and straightforward, consisting of static methods that require no instantiation.
-   **Robust Error Handling:** Handles null or empty matrices gracefully, preventing `NullPointerException` and providing informative messages.

---

### How to Use the API 🧑‍💻

To use the `Matrixnator` in your project, simply include the library's JAR file as a dependency or copy the `Matrixnator.java` class directly into your project.

#### Adding as a Dependency (Maven)

If you are using Maven, add the following dependency to your `pom.xml` file:

```xml
<dependency>
    <groupId>ronaldo.matrix</groupId>
    <artifactId>matrixnator</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
