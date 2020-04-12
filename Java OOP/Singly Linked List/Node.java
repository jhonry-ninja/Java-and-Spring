/*
Singly Linked List
In this assignment, you will create your own implementation of a singly linked 
list in Java. You will need 3 files: Node.java, SinglyLinkedList.java, and 
ListTester.java. As long as these files are in the same directory, you will not 
need to import them explicitily. We recommend that you create a ListAssignment 
folder and place your 3 files there. 

Objectives:
• Practice creating classes and objects.
• Learn and implement a singly linked list in Java.

Tasks:
• Create a Node class like the above.
• Fill in the constructor method that sets the value to a given number and 
next to null of your Node objects.
*/

public class Node {
    public int value;
    public Node next;
    public Node(int value) {
        // your code here
        this.value = value;
        this.next = null;
    }
}

