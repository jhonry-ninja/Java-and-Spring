
/* 
Lists of Exceptions
Your new PM knows you don't know Java too well. She wants you to familiarize 
yourself with generics and exceptions and figure out exactly how they work. 
First, she wants you to make an ArrayList with both numbers and strings in it:

ArrayList<Object> myList = new ArrayList<Object>();
myList.add("13");
myList.add("hello world");
myList.add(48);
myList.add("Goodbye World");

You will loop through the list and try assigning each item to an int variable. 
To do this, you will also need to cast your list item as an Integer; you can 
do this like this:

for(int i = 0; i < myList.size(); i++) {
    Integer castedValue = (Integer) myList.get(i);
}


After you have set up this code, try running it. It should throw a 
ClassCastException. Change the program above to utilize exception 
handling to print out the error messages, the index of the ArrayList 
where the error occurred, and the value of the object that triggered 
the error. The program should continue after printing this to the 
console.

Objectives:
• Implement exception handling.

Tasks:
• Create ArrayList
• Try to cast each element to an Integer
• Use try/catch blocks to handle the exceptions
*/

import java.util.*;

public class ListOfExceptions {
    public void workTest() {
        final ArrayList<Object> workList = new ArrayList<Object>();
        workList.add("13");
        workList.add("Insane in the membrane...");
        workList.add(14);
        workList.add("Insane in the brain!");

        try {
            for (int i = 0; i < workList.size(); i++) {
                final Integer castedValue = (Integer) workList.get(i);
            }
        } 
        catch (final ClassCastException e) {
            System.out.println("Yay!");
        }

    }
    public static void main(String[] args) {

    }
    
}
