# ☕ Java Features (Java 8 to 21+)

This project demonstrates the evolution of Java from Java 8 to Java 21+, with hands-on examples for each major feature. It's designed to help developers quickly understand, test, and apply modern Java features in real-world applications.

---

## 📚 Java Version-wise Highlights

### 💡 Java 9
- Modules (`module-info.java`)
- JShell (REPL)
- Private methods in Interfaces
- Stream API Enhancements: `takeWhile()`, `dropWhile()`, `iterate()`
- `Optional.ifPresentOrElse()`

### 🔎 Java 10
- Local Variable Type Inference (`var`)
- Optional `orElseThrow()`

### 🚀 Java 11
- `String` methods: `isBlank()`, `lines()`, `repeat()`, `strip()`
- `Files.readString()` and `Files.writeString()`
- `var` in lambda

### ⚙️ Java 12
- `File.mismatch(Path, Path)`
- Compact Number Formatting
- Switch expression (Preview)

### 🔄 Java 13
- Text Blocks (Preview)
- Dynamic CDS Archives

### 🧵 Java 14
- Switch Expressions (Standardized)
- Records (Preview)
- Helpful NullPointerExceptions

### 🧩 Java 15
- Sealed Classes (Preview)
- Text Blocks (Standard)
- Hidden Classes

### 🪟 Java 16
- Records (Standard)
- Pattern Matching for `instanceof`
- Stream and Collectors Enhancements
- `DateTimeFormatter.ofLocalizedDate()`

### 🔐 Java 17 (LTS)
- Sealed Classes (Standard)
- Pattern Matching in Switch (Preview)
- Strong Encapsulation of JDK internals

### 🌐 Java 18
- Simple Web Server API
- UTF-8 as Default Charset
- Code Snippets in JavaDoc

### 🧵 Java 19
- Virtual Threads (Preview)
- Structured Concurrency (Preview)
- Pattern Matching for `switch` (2nd Preview)

---

## 🏗️ Project Structure

java-features/
├── src/
│ └── main/
│ └── java/
│ ├── java8/
│ ├── java9/
│ ├── java10/
│ └── ... java21/
├── pom.xml
└── README.md


---

## 🔧 How to Run

```bash
# Compile the project
mvn clean install

# Run a specific feature class
java -cp target/classes java17.sealed.SealedClassExample
🤝 Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you'd like to change.

🧠 Author
Neelu Sahai
📧 neelhuma@gmail.com


