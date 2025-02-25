https://advancedweb.hu/a-categorized-list-of-all-java-and-jvm-features-since-jdk-8-to-21/
https://levelup.gitconnected.com/a-comprehensive-journey-from-java-8-to-java-21-with-code-examples-of-essential-api-enhancements-6817d2ab3ba8
https://medium.com/@akineralkan/modern-java-an-in-depth-guide-from-version-8-to-21-by-akiner-alkan-f89b50e13c72
https://www.happycoders.eu/java/java-22-features/

Language Enhancements:
----------------------
1. Local Variable Type Inference in Lambda Expressions (11)
2. String Indent and Transform (12)
    - Indent method is used to add an indentation to each line of a string. It returns a new String instance with the specified number of spaces added to the beginning of each line.
3. Files Mismatch (12)
   - Files.mismatch method is part of the java.nio.file package in Java, and it is used to compare the content of two files for differences. It’s specifically designed to efficiently determine whether two files have differing content without needing to read the entire contents of the files.
4. TextBlocks (13:preview -> 15:permanent)
   - Text Blocks were introduced as a preview feature in Java 13 and were made a permanent part of the Java language in Java 15. It provides a more readable and natural way to define strings that span multiple lines without the need for concatenation or escape characters.
5. Yield in Switch statement (14)
   -  Java 12 introduces expressions to Switch statement and released it as a preview feature. Java 13 added a new yield construct to return a value from switch statement. With Java 14, switch expression now is a standard feature.
6. Helpful NullPointerExceptions (14)
7. Pattern Matching for instanceof (14:preview -> 16:permanent)
    - Java 16 introduced pattern matching for the instanceof operator, which streamlines type checking and casting into a single operation. This feature enhances code readability and reduces boilerplate.
8. Records (14:preview -> 16:permanent)
9. Sealed class (17)
   - Is a feature to enhance the control over class inheritance and ensure that only specific subclasses can extend it. It provides a way to declare a limited set of classes that are allowed to inherit from the sealed class, while preventing other classes from extending it.
10. Pattern Matching for switch (21)
11. Record Patterns - Pattern matching and record classes (21)
12. String Templates (22 - preview)
13. Unnamed Classes and Instance Main Methods (21 - preview)
14. Unnamed Variables & Patterns (22)
15. Statements before super(...)  (22 - preview)
16. Implicitly Declared Classes and Instance Main Methods (22 - preview)

JVM Enhancements:
-----------------
1. GC Interface (10)
2. Parallel Full GC for G1 (10)
3. Thread-Local Handshakes (10)
4. Alternative Memory Devices (10)
5. Epsilon GC (11)
6. Low-Overhead Heap Profiling
7. Garbage Collector Updates (Java 15)
   - Z Garbage Collector was an experimental feature till Java 15. It is low latency, highly scalable garbage collector.
   - ZGC was introduced in Java 11 as an experimental feature as developer community felt it to be too large to be released early. A lot of improvements are done to this garbage collection since then.
   - ZGC is highly performant and works efficiently even in case of massive data applications e.g. machine learning applications. It ensures that there is no long pause while processing the data due to garbage collection. It supports Linux, Windows and MacOS.
   - The Shenandoah low-pause-time garbage collector is now out of the experimental stage. It had been introduced into JDK 12 and from java 15 onwards, it is a part of standard JDK.
8. AA
  - a

API Enhancements:
-----------------
- HTTP Client (11)
- JVM Constants (12)
- Foreign-Memory Access API (21)
- Foreign Function & Memory API (preview till 21 -> 22 permanent)
- Sequenced Collections (21)
- Virtual Threads (21)
- Scoped Values (21 - preview)
- Vector API (21 - incubator)
- Structured Concurrency (preview till 22)
- Stream Gatherers (22 - preview)
- Class-File API (22 - preview)

Tools:
------
- Javah Removed (10)
- Single Source File Launch (11)
- Flight Recorder (11)
- Packaging Tool (16)
- Launch Multi-File Source-Code Programs (22)