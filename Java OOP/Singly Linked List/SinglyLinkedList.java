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
• Create a SinglyLinkedList class like the above.
• Create a constructor method that sets the head to null of your 
  SinglyLinkedList objects
• Create a remove() method that will remove a node from the end of your list
• Create printValues() method that will print all the values of each node 
  in the list in order
*/

public class SinglyLinkedList{
    public Node head;

    //Constructors
    public SinglyLinkedList(){
        this.head = null;
    }

    //Methods
    public void add(int value){
        Node newNode = new Node(value);
        if(this.head == null){
            this.head = newNode;
        }
        else{
            Node runner = this.head;
            while(runner.next != null){
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    public void remove(){
        if(head.next == null){
            this.head = null;
        }
        Node runner = this.head;
        while(runner.next.next != null){
            runner = runner.next;
        }
        runner.next = null;
    }
    public void printValues(){
        Node runner = this.head;
        if(head == null){
            System.out.println("No nodes!");
        }
        while(runner.next != null){
            System.out.println(runner.value);
            runner = runner.next;
        }
        System.out.println(runner.value);
    }

    // Optional Methods
    // public find(int value){
    //     Node runner = this.head;
    //     if(runner.next.value == value){
    //         return runner.value;
    //     }
    //     while(runner.next != null){
    //         if(runner.next.value == value){
    //             return runner.value;
    //         }
    //         runner = runner.next;
    //     }
    // }
    
    // public void removeAt(int value){
    //     Node runner = head;
    //     if(value == 0){
    //         if(runner.next){
    //             head = runner.next;
    //         }
    //         else{
    //             head = null;
    //         }
    //     }
    //     while(
    // }
}