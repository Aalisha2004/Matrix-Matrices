## 📘 Matrix Operations – Java Programs

This repository contains Java programs that demonstrate different matrix operations. Each file implements a specific functionality related to matrix manipulation.

---

### 📂 Files Overview

1. **`Matrices.java`**

   * **Purpose**: Basic matrix operations like creation, input, display, addition, and multiplication.
   * **Highlights**:

     * Demonstrates user input for matrices.
     * Includes methods for:

       * Matrix addition
       * Matrix multiplication
       * Displaying matrices

2. **`DiagonalSum.java`**

   * **Purpose**: Computes the sum of both primary and secondary diagonals of a square matrix.
   * **Highlights**:

     * Avoids double-counting the center element in odd-dimensional matrices.
     * Reads matrix elements from user input.

3. **`SortedMatrix.java`**

   * **Purpose**: Efficiently searches for an element in a sorted 2D matrix.
   * **Highlights**:

     * Matrix rows and columns are sorted in ascending order.
     * Uses a linear search from the top-right corner to find the target in O(m + n) time.

4. **`SpiralMatrix.java`**

   * **Purpose**: Prints a matrix in spiral (clockwise) order.
   * **Highlights**:

     * Accepts matrix input from the user.
     * Traverses layers of the matrix from the outside in.

---

### 💻 How to Compile & Run

You can compile and run these programs using the command line:

```bash
javac FileName.java
java FileName
```

Example:

```bash
javac Matrices.java
java Matrices
```

Make sure you have Java installed and added to your system's `PATH`.

---

### 🛠 Prerequisites

* Java Development Kit (JDK) installed.
* Basic knowledge of Java and matrices.

---

### 📌 Notes

* All programs accept user input from the console.
* These examples are designed for educational purposes to illustrate matrix logic in Java.


