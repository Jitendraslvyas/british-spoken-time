# 🕰 British Spoken Time

A simple Java 21-based command-line utility that converts digital 24-hour time input into **British spoken time format**.

---

## 📌 Features

- Accepts flexible `H:mm` or `HH:mm` input (e.g., `9:5`, `07:30`, `23:59`, `0:00`)
- Converts to British-style spoken phrases:
  - `1:00` → `one o'clock`
  - `4:15` → `quarter past four`
  - `7:30` → `half past seven`
  - `11:55` → `five to twelve`
  - `00:00` → `midnight`
- Gracefully handles invalid inputs like `24:00`
- Modular and extensible using Strategy Design Pattern
- Fully unit-tested with JUnit 5

---

## 📂 Project Structure

```
british-spoken-time/
├── pom.xml
├── src/
│   ├── main/
│   │   └── java/com/example/britishtime/
│   │       ├── BritishSpokenTimeApplication.java
│   │       ├── BritishSpokenTimeService.java
│   │       ├── TimePhraseStrategy.java
│   │       ├── SpokenTimeFormatter.java
│   │       ├── [Multiple Strategy Classes...]
│   └── test/
│       └── java/com/example/britishtime/
│           └── BritishSpokenTimeServiceTest.java
```

---

## 🛠 Requirements

- Java 21
- Maven 3.8+

---

## 🚀 How to Run

```bash
# 1. Clone or extract the project
cd british-spoken-time

# 2. Compile and run
mvn clean compile
mvn exec:java
```

📥 When prompted, enter a time like:
```
Enter time in 24-hour format (H:mm or HH:mm), e.g., 9:5, 09:05, 0:00, 23:59:
```

🗣 Output:
```
British Spoken Time: quarter past four
```

---

## ✅ How to Run Tests

```bash
mvn test
```

---

## ❌ Invalid Input Handling

- `24:00` → Rejected with clear message
- Incorrect format (e.g., `9-5`, `abc`) → Gracefully handled

---

## 🧠 Design

- Strategy Pattern is used to match time cases like:
  - `ExactHourStrategy`, `HalfPastStrategy`, `QuarterToStrategy`, etc.
- Easy to add new styles or internationalization

---

## 📖 Examples

| Input    | Output              |
|----------|---------------------|
| `1:00`   | one o'clock         |
| `4:15`   | quarter past four   |
| `7:30`   | half past seven     |
| `9:45`   | quarter to ten      |
| `00:00`  | midnight            |
| `12:00`  | noon                |
| `24:00`  | ❌ Invalid input     |

---

## 🧑‍💻 Author

- **Jitendra Vyas** ([Jitendraslvyas](https://github.com/Jitendraslvyas/))
---
