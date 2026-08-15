# Advent of Code 2015 - Day 5 (Processing Visualizer)

A Java and Processing visualizer that solves the [Advent of Code 2015 Day 5](https://adventofcode.com/2015/day/5) puzzle ("Doesn't He Have Intern-Elves For This?").

The program reads string inputs line-by-line from `Input.txt`, evaluates whether each string meets the rules for a "nice" string versus a "naughty" string, and visually displays the result frame-by-frame with a present graphic for nice strings and a red X for naughty ones.

## String Validation Rules

A string is considered **nice** if it meets all three conditions:
1. Contains at least three vowels (`a`, `e`, `i`, `o`, `u`).
2. Contains at least one letter that appears twice in a row (e.g., `xx` or `dd`).
3. Does **not** contain the forbidden substrings (`ab`, `cd`, `pq`, or `xy`).

## How to Run

1. Clone or download this repository.
2. Ensure `Input.txt` is present in the root directory.
3. Open the project in your Java IDE (IntelliJ IDEA, Eclipse, or VS Code).
4. Ensure the **Processing core library** (`core.jar`) is added to your project dependencies/classpath.
5. Run `Main.java`.

## Requirements

* Java JDK 8 or higher
* Processing 3/4 `core.jar` library
