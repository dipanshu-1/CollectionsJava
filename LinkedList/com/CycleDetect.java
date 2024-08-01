package LinkedList.com;
import java.util.*;
public class CycleDetect {
    static Node head;
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data  = data;
            next = null;
        }
    }

    public void add(int val)
    {
        Node new_node = new Node(val);
        new_node.next = head;
        head = new_node;

    }
    public static boolean detectCycle()
    {
        Node slow_ptr = head;
        Node fast_ptr = head;
        int flag = 0;
        while(fast_ptr!=null && fast_ptr.next!=null)
        {
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;
            if(fast_ptr == slow_ptr)
            {
                flag = 1;
                break;
            }
        }
        Node startPoint = head;
        if(flag==1)
        {
            while(startPoint!=slow_ptr)
            {
                startPoint = startPoint.next;
                slow_ptr = slow_ptr.next;
            }
        }
        if(flag == 1)
        {
            System.out.println("loop start from " + startPoint.data);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        CycleDetect list = new CycleDetect();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.head.next.next.next = list.head;
        boolean iscycle = detectCycle();
        System.out.println("cycle present "+ iscycle);
    }

}
