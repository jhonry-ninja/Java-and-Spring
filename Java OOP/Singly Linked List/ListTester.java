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
• Create a ListTester class like the above.
*/

public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        sll.remove();
        sll.remove();
        sll.printValues();
    }
}