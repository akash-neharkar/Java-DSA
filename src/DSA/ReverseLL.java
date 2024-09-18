package DSA;
import java.util.*;

public class ReverseLL {

    public static void main(String[] args) {
        ReverseLL list = new ReverseLL(); // Changed LinkedList to ReverseLL

        // Adding elements to the linked list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Printing original list
        System.out.println("Original Linked List:");
        list.printList();

        // Reversing the linked list
        list.reverse();

        // Printing reversed list
        System.out.println("Reversed Linked List:");
        list.printList();
    }

    // Node class representing each element in the LinkedList
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the linked list
    private Node head; // Changed to private for encapsulation

    // Function to reverse the singly linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        // Traverse the list and reverse the links
        while (current != null) {
            next = current.next; // store the next node
            current.next = prev; // reverse the link
            prev = current; // move prev one step forward
            current = next; // move current one step forward
        }
        head = prev; // set the new head of the reversed list
    }

    // Function to add a node to the linked list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Function to print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
