package LinkedList.com;

import java.util.Stack;

public class Palindrome {
    Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int val)
        {
            data = val;
            next = null;
        }
    }
    public static void print(Node head)
    {
        while(head!=null)
        {
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
        Stack<Integer> st = new Stack<>();
        Node slow = list;
        while(slow!=null)
        {
            st.push(slow.data);
            slow = slow.next;
        }
        while(list!=null)
        {
            if(st.peek()!=list.data)
            {
                System.out.println("Not a palindrome");
                return;
            }
            else
            {
                st.pop();
                list = list.next;
            }
        }
        System.out.println(" palindrome");


    }
}
