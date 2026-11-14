# Java String Overview & Guide

A concise reference and code repository demonstrating how `java.lang.String` works in Java, including memory management, immutability, and essential manipulation methods.

## 📌 Overview

In Java, a **`String`** is an object that represents a sequence of characters (`char` values). Unlike primitive data types (`int`, `boolean`), `String` is a final class provided in the `java.lang` package and implements `Serializable`, `Comparable<String>`, and `CharSequence`.

### Key Characteristics
* **Immutable:** Once a `String` object is created, its value cannot be modified. Any operation that appears to alter a string actually creates a new `String` instance.
* **String Constant Pool:** String literals are stored in a special area of the Java Heap called the String Pool to optimize memory by reusing identical string instances.
* **Thread-Safe:** Because strings are immutable, they are inherently safe to share across multiple threads without synchronization.

---

## 🚀 Usage & Examples

### 1. Creating Strings
```java
// Using a String literal (stored in the String Pool)
String greeting = "Hello, World!";

// Using the 'new' keyword (creates a new object in Heap memory)
String message = new String("Welcome to Java");
```

### 2. Common String Methods
```java
String text = "  Java Programming  ";

int length = text.length();                  // 20
String trimmed = text.trim();                // "Java Programming"
String upper = trimmed.toUpperCase();        // "JAVA PROGRAMMING"
String sub = trimmed.substring(0, 4);        // "Java"
boolean hasJava = trimmed.contains("Java");  // true
String replaced = trimmed.replace("Java", "Core Java"); // "Core Java Programming"
```

### 3. String Comparison
Always use `.equals()` to compare string values rather than `==`, which compares memory references.
```java
String s1 = "Java";
String s2 = new String("Java");

System.out.println(s1 == s2);      // false (different memory references)
System.out.println(s1.equals(s2)); // true (identical character content)
```

---

## ⚡ Performance Tip: `String` vs. `StringBuilder`

If your application requires frequent string modifications (such as appending inside a loop), use **`StringBuilder`** instead of `String` to avoid creating unnecessary intermediate objects in memory.

| Class | Mutability | Thread-Safe | Best Use Case |
| :--- | :--- | :--- | :--- |
| **`String`** | Immutable | Yes | Constants, keys, and strings that rarely change |
| **`StringBuilder`** | Mutable | No | Heavy string manipulation in single-threaded code |
| **`StringBuffer`** | Mutable | Yes | Heavy string manipulation in multi-threaded code |

---

## 🛠️ Prerequisites & Running the Code

* **JDK:** Java 8 or higher (Java 9+ includes Compact Strings for improved memory efficiency)
* **Compile & Run:**
  ```bash
  javac Main.java
  java Main
  ```

