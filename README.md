# Log Analyzer

1. Project Title & Goal

A Core Java command-line tool that parses a server log file, counts total ERROR entries, and extracts specific error messages.

---

2. Setup Instructions

### Requirements

* Java 8 or above
* Command Prompt / Terminal
* NetBeans (optional, only for development)

### Commands to Run

Open terminal in the project root directory and run:

javac --release 8 src/loganalyzer/LogAnalyzer.java
java -cp src loganalyzer.LogAnalyzer server.log

---

3. The Logic (How I Thought)

### Why did I choose this approach?

I chose a Core Java–based file handling and string processing approach because it is lightweight, fast, and does not require any external libraries. Since this is a CLI-based log analysis task, reading the file line by line using `BufferedReader` and checking for `[ERROR]` entries was the most efficient and clear solution.

### What was the hardest bug you faced, and how did you fix it?

The hardest issue I faced was a Java version mismatch error. The code was compiled using a newer Java compiler, but it was executed on Java 8 runtime, which caused a `UnsupportedClassVersionError`. I fixed this by recompiling the program using Java 8 compatibility with the `--release 8` flag.

---

4. Output Screenshots

Below is the screenshot proving that the program runs successfully and prints the error summary as required.

![Log Analyzer Output](output.png)

---

5. Future Improvements

If I had two more days, I would:

* Add support for additional log levels like `[WARN]` and `[INFO]`
* Generate a downloadable summary report file
* Improve performance for very large log files
* Add regex-based parsing for more complex log formats

