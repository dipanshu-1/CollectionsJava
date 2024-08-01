package LinkedList.com;


import java.util.Scanner;

public class RemoveOccurence {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node list = new Node(5);
        Node new_node = new Node(10);
        list.next = new_node;
        new_node.next = new Node(20);
        new_node = new_node.next;
        new_node.next = new Node(10);
        new_node = new_node.next;
        new_node.next = new Node(5);
        print(list);
        System.out.println("Enter the number u want to delete");
        Scanner input = new Scanner(System.in);
        int key = input.nextInt();
        Node temp = list, prev = null;
        while (temp != null && temp.data == key) {
            list = temp.next;
            temp = list;
        }
        while (temp != null) {
            while (temp != null && temp.data != key) {
                prev = temp;
                temp = temp.next;
            }
            if (temp == null)
                break;
            prev.next = temp.next;
            temp = prev.next;
        }
        print(list);

    }
}


