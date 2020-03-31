/* FizzBuzz

Write a program that will take an integer and print Fizz 
if the number is divisible by 3, Buzz if the number is 
divisible by 5, FizzBuzz if the number is divisible by 3 
and 5, and the number itself for all other cases.

Objectives:
• Practice conditionals.
• Implement a classic interview algorithm.

Tasks:
• Create a FizzBuzz class that implements the following logic: */

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzz bzzz = new FizzBuzz();
        String result = bzzz.fizzBuzz(2);
        System.out.println(result);
    }
}