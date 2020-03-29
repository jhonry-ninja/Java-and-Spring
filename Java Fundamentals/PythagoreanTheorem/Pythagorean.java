// Pythagorean Theorem
/* In this assignment, you will create a Java program to implement 
the Pythagorean Theorem.

To complete this assignment, you will need the Math class from the java.lang 
package. This package provides fundamentals classes to the Java programming 
language such as Object, Boolean, String, Integer, Math, etc. Therefore, the 
java.lang package is automatically imported and ready to use in every Java 
program. */

// Objectives:
/*  ● Learn how to import a class into your project.
    ● Practice object instantiation.
    ● Practice method invocation.
    ● Use the java.lang package. */

// Tasks:

//  ● Create a Pythagorean class in javaFun.
public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        // the hypotenuse is the side across the right angle. 
        // calculate the value of c given legA and legB
        double legC = (legA)^2 + (legB)^2;  // Add legA squared and legB squared
        double squareRoot = Math.sqrt(legC);    // Square root of line above
        return squareRoot;
    }
    
}
