/* 
Puzzling

After you passed the first challenge, the company decided they 
wanted to give you a few puzzles to solve. As they put it: 
"The first challenge was just to check your familiarity with 
the language, now we want to see your problem-solving skills."

For this assignment, we are going to introduce two new classes: 
Collections and Random. We are going to use the former to shuffle 
and sort a collection, and the latter to get a random output. 
For example:

Puzzling.java */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Puzzling{
    public static void main(String[] args){
        int[] myArray = {3,5,1,2,7,238,8,13,25,32};
        System.out.println(printArr());
        shuffleArr();
        randomArray55To100();

        System.out.println("Sorted Array : "+ Arrays.toString(sortArray()));
        System.out.println("Random 5 characters : "+randStr5CharLong());
        System.out.println("Array of 10 random characters : " +Arrays.toString(random10StringArray()));
    
    }
    public static ArrayList printSum(/*int[] myArray*/){
        int[] myArray = {3,5,1,2,7,238,8,13,25,32};
        double sum = 0;
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for (int i=0;i<myArray.length;i++){
            sum += myArray[i];
            if (myArray[i]>10){
                newArray.add(myArray[i]);
            }
        }
        System.out.println("sum of given array: "+sum);
        return newArray;
    }
    public static ArrayList printArr(){
        ArrayList<String> myArray = new ArrayList<String>();
        myArray.add("Nancy");
        myArray.add("Jinichi");
        myArray.add("Fujibayashi");
        myArray.add("Momochi");
        myArray.add("Ishikawa");
        Collections.shuffle(myArray);
        for (int i=0;i<myArray.size();i++){
            if (myArray.get(i).length()<6){
                myArray.remove(i);
            }
        }
        System.out.println("Names with more than 5 letters: " + myArray);
        return myArray;
    }
    public static void shuffleArr(){
        // char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        // char letter = alphabet[0];
        // Note: collections - shuffle method cannot be used with primitive data type. only works with Object types

        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        // To shuffle a collection, you can use the shuffle method of the Collections class:
        Collections.shuffle(Arrays.asList(alphabet));
        
        String letter = alphabet[0];
        
        // System.out.println(letter);
        System.out.println("First letter of Array : "+ letter);
        System.out.println("Last letter of Array : "+ alphabet[25]);
        if (letter == "a" || letter == "e" || letter == "i" || letter == "o" || letter == "u"){
            System.out.println("The first letter is a vowel");
        }
    }

    public static int[] randomArray55To100(){
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i=0; i<10;i++){
            // To get a random integer, you can use the nextInt method of the Random class:
            arr[i] = rand.nextInt(46)+55; // nextInt(46) -> random 0-45 
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static int[] sortArray(){
        int[] newArray = randomArray55To100();
        // To sort a collection, you can use the sort method of the Collections class:
        Arrays.sort(newArray);
        System.out.println("Minimum value in an array : "+ newArray[0]);
        System.out.println("Maximum value in an array : "+ newArray[newArray.length-1]);
        return newArray;
    }
    public static String randStr5CharLong(){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int alphaLength = alphabet.length();
        String newstr = "";
        Random rand = new Random();
        for (int i = 0; i<5; i++){
            newstr += alphabet.charAt(rand.nextInt(alphaLength));
        }
        System.out.println(newstr);
        return newstr;
    }

    public static String[] random10StringArray(){
        String[] myArray = new String[10];
        for(int i=0;i<10; i++){
            String randStr = randStr5CharLong();
            myArray[i] = randStr;
        }
        System.out.println(myArray);
        return myArray;
    }
}


/*
Objectives:
• Implement different algorithms in java.
• Practice Array and ArrayList.
• Practice loops.
• Learn and use the Collections and Random classes.

Tasks:
Work on the puzzles below. Make your code as clean as possible. The class name 
should be PuzzleJava; you will need to create methods for each of the tasks below 
and test them in the main method.

• Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print the 
  sum of all numbers in the array. Also have the function return an array that 
  only includes numbers that are greater than 10 (e.g. when you pass the array 
  above, it should return an array with the values of 13,25,32)
• Create an array with the following values: Nancy, Jinichi, Fujibayashi, 
  Momochi, Ishikawa. Shuffle the array and print the name of each person. Have 
  the method also return an array with names that are longer than 5 characters.
• Create an array that contains all 26 letters of the alphabet (this array must 
  have 26 values). Shuffle the array and, after shuffling, display the last 
  letter from the array. Have it also display the first letter of the array. 
  If the first letter in the array is a vowel, have it display a message.
    • To shuffle a collection, you can use the shuffle method of the Collections 
      class. Collections Class documentation
• Generate and return an array with 10 random numbers between 55-100.
    • To get a random integer, you can use the nextInt method of the Random 
      class. Random Class documentation
• Generate and return an array with 10 random numbers between 55-100 and have 
  it be sorted (showing the smallest number in the beginning). Display all the 
  numbers in the array. Next, display the minimum value in the array as well 
  as the maximum value.
    • To sort a collection, you can use the sort method of the Collections class.
• Create a random string that is 5 characters long.
• Generate an array with 10 random strings that are each 5 characters long */