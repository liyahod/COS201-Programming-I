# COS 201 — Computer Programming I

## Student Information
- Name: akagwu bright 
- Matriculation Number: 26/20750
- Programme: Cyber security 
- Level: 200 Level
- Course: COS 201 — Computer Programming I

> Check that these details are correct before submitting.

## Week 1: Introduction to Programming and Problem-Solving

### Practical
I created `week01/FirstProgram.java`. It displays the course, my programme of study, three reasons programming is useful to my discipline, and a learning goal for COS 201.

### How to run
From the repository folder:
```bash
cd week01
javac FirstProgram.java
java FirstProgram
```

## Week 2: Development Environment and First Java Program

### Objective
To practise writing, compiling and running a basic Java programme.

### Tools
- Java Development Kit (JDK)
- Visual Studio Code
- Git
- GitHub Desktop
- GitHub

### File
- `week02/HelloWorld.java`

### How to run
From the repository folder:
```bash
cd week02
javac HelloWorld.java
java HelloWorld
```

### What I practised
I practised creating a Java class with a `main` method, displaying messages with `System.out.println()`, compiling the source file and running the programme.

## Week 3: Variables, Data Types, Expressions and Input/Output

### Objectives
- To learn the basics of having programming.
- To understand how to write simple java programs.
- Perform arithmetic calculations.
- Read keyboard input using `Scanner`.
- To practice solving problems with java.
- Compile and test Java programmes.

### Programmes
1. `week03/SimpleCalculator.java` — accepts two numbers and displays their sum, difference, product and quotient. It checks for division by zero.
2. `week03/AverageCalculator.java` — accepts a student's name and three scores, then displays the total and average.
3. `week03/ItemCost.java` — accepts an item quantity and unit price, then calculates the total cost.

### How to run
Open a terminal in the repository folder and run each programme:
```bash
cd week03
javac SimpleCalculator.java
java SimpleCalculator

javac AverageCalculator.java
java AverageCalculator

javac ItemCost.java
java ItemCost
```

### Testing
Test each programme with different inputs. For example:
- Calculator: enter `12` and `3`; expected sum `15`, difference `9`, product `36`, quotient `4`.
- Average: enter three scores `60`, `70` and `80`; expected total `210`, average `70`.
- Item cost: enter quantity `6` and unit price `250`; expected total cost `1500`.
- Calculator division-by-zero check: enter a second number of `0`; the programme should display a warning instead of dividing.

## Repository Structure
```text
COS201-Programming-I/
├── README.md
├── week01/
│   └── FirstProgram.java
├── week02/
│   └── HelloWorld.java
└── week03/
    ├── SimpleCalculator.java
    ├── AverageCalculator.java
    └── ItemCost.java
```

