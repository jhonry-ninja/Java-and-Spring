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

public class FizzBuzz {
    public String fizzBuzz(int number) {
        // fizzbuzz logic here
        if(number % 3 == 0 && number % 5 == 0){
            return "FizzBuzz";
        }


        else if(number % 5 == 0){
            return "Buzz";
        }


        else if(number % 3 == 0){
            return "Fizz";
        }
        

        return String.valueOf(number);
    }
}