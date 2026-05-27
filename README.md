# AP Computer Science A — 2019-2020

My coursework portfolio from **AP Computer Science A**, which I took in person at **Marjory Stoneman Douglas High School** in Parkland, Florida during my junior year of high school (2019-2020 school year). Twenty-plus standalone Java programs organized into the eight modules of the AP CS A curriculum, walking from `System.out.println` up through object-oriented design with implementation/tester class pairs — the same scope the College Board's AP exam covers.

AP Computer Science A is an introductory college-level course taught in Java, ending in a College Board AP exam. At MSD it was a year-long, in-classroom elective with assignments structured around eight curriculum modules. Each module ended in a major programming assignment, and this repo holds the ones I submitted: every program here is the final, graded version of a single module deliverable.

I'm keeping this repo public because it's the honest starting point of my engineering trajectory: each module is a labeled checkpoint in learning how to think in Java, and the progression from "print statements" in Module 01 to multi-class OOP in Module 08 is exactly the curve a hiring manager or fellow engineer can read at a glance.

## Features

- **Eight ordered modules** — each `Module XX/src/` directory targets one core AP CS A topic, in pedagogical order: I/O → primitives → strings → conditionals → loops & files → arrays → methods → classes/OOP
- **Real input/output programs** — `BMI`, `TDEE`, `buyMovieTickets`, `CurrencyV1` are interactive console apps that take user input via `Scanner` and produce formatted reports
- **Data-driven programs** — `HurricaneSelector` reads 156 rows of Atlantic hurricane data, filters by year range, and writes a summary report; `Family` and `AnimalPopulation` are file-driven probability simulations
- **OO progression in Module 08** — `SquareV3` → `SquareV7` → `SquareV8` traces the same shape problem through default constructors, parameterized constructors, and finally an array-of-objects pattern with min/max/average aggregation
- **Special projects** — a `TrickOrTreat` candy-randomizer that's essentially a Halloween-themed FizzBuzz with modular arithmetic

## Tech Stack

- **Language**: Java (Java 8-compatible source)
- **IDE**: IntelliJ IDEA (`.iml` project file at repo root)
- **Standard library only** — `java.util.Scanner`, `java.io.File`, `java.io.PrintWriter`, `java.util.ArrayList`, `Math.random()`. No external dependencies.

## Getting Started

### Prerequisites

- JDK 8 or newer (`javac` and `java` on your `PATH`)
- Optional: IntelliJ IDEA if you want the project file to do the work for you

### Running a single program

Every class has its own `main`, so each program runs independently:

```bash
cd "Module 04/src"
javac BMI.java
java BMI
```

### Data-file programs

A few programs read from text files that live in the same working directory at runtime:

- `Module 05/src/Family.java` expects `maleFemaleInFamily.txt`
- `Module 06/src/HurricaneSelector.java` expects `HurricaneData.txt`
- `Module 07/src/PlanetGravity.java` writes `planetgravity.txt`
- `Module 07/src/PlanetWeight.java` expects `planetweight.txt`

The data files aren't tracked in this repo (they were assignment-provided). For the file-reading programs, drop a matching `.txt` in the working directory before running.

## Project Structure

```
APComputerScienceA2019-2020/
├── Module 01/src/    # Print statements & basic I/O (StudentInfoCard)
├── Module 02/src/    # Variables, primitive types, arithmetic operators
├── Module 03/src/    # Scanner input, String manipulation, parsing
├── Module 04/src/    # Conditionals & decision logic (BMI, TDEE)
├── Module 05/src/    # Loops, randomness, file I/O, Monte Carlo
├── Module 06/src/    # Arrays, parallel arrays, formatted output (printf)
├── Module 07/src/    # Methods, return types, static helpers
├── Module 08/src/    # Classes, encapsulation, implementation/tester pairs
├── Special Projects/ # TrickOrTreat — modular-arithmetic branching
└── AP Computer Science A.iml    # IntelliJ project descriptor
```

## Course Context

- **Class**: AP Computer Science A
- **School**: Marjory Stoneman Douglas High School, Parkland, FL (in-person classroom course)
- **School year**: 2019-2020 (my junior year of high school)
- **Curriculum**: 8 modules + 1 special-projects module, one major programming assignment per module
- **Exam**: College Board AP CS A end-of-course exam, taught in Java
- **Submission format**: each program below was the graded deliverable for a single module

## License

Unlicensed — personal coursework.

## Author

Jacob Kanfer — [GitHub](https://github.com/Technical-1)
