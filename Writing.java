package AllFiles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writing  {

    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\srini\\OneDrive\\Desktop\\TEXT FILES\\book.txt";

        FileWriter fw = new FileWriter(path);

        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Java theory encompasses the fundamental principles and concepts that underpin the Java programming language and its ecosystem. Key aspects of Java theory include:\n" +
                "1. Object-Oriented Programming (OOP):\n" +
                "Java is a class-based, object-oriented language. The core principles of OOP are central to Java:\n" +
                "Classes and Objects: Classes serve as blueprints for creating objects, which are instances of those classes and represent real-world entities with properties (data) and behaviors (methods).\n" +
                "Encapsulation: Bundling data and methods that operate on the data within a single unit (class) and restricting direct access to the data from outside the class.\n" +
                "Inheritance: Allowing a class to inherit properties and behaviors from another class, promoting code reusability and establishing \"is-a\" relationships.\n" +
                "Polymorphism: The ability of an object to take on many forms, allowing objects of different classes to be treated as objects of a common type.\n" +
                "Abstraction: Hiding complex implementation details and exposing only essential features to the user.");

        bw.write("\n\n2. Platform Independence (Write Once, Run Anywhere - WORA):\n" +
                "Java's \"Write Once, Run Anywhere\" principle is a cornerstone of its design.\n" +
                "Java Virtual Machine (JVM): Java code is compiled into platform-neutral bytecode, which can then be executed on any system that has a compatible JVM installed, regardless of the underlying operating system or hardware architecture.");


        bw.write("\n\n3. Memory Management:\n" +
                "Garbage Collection: Java includes automatic garbage collection, which handles memory deallocation by identifying and reclaiming memory occupied by objects that are no longer referenced, reducing the risk of memory leaks.");


        System.out.println("completed");

        bw.close();
    }


}
