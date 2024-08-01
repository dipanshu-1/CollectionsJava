package LinkedList.com;

public class RemoveNthObject {

        Node head;

        static class Node

        {

            int data;

            Node next;

            Node(int val)

            {

                data  = val;

                next = null;

            }

        }

        public void add(int val)

        {

            Node newNode = new Node(val);

            newNode.next = head;

            head = newNode;

        }

        static void printList(Node head)

        {

            Node ptr = head;

            while (ptr != null) {

                System.out.print(ptr.data + " ");

                ptr = ptr.next;

            }

            System.out.println();

        }

        public static Node deleteNode(Node head,int n)

        {

            Node fast = head;

            Node slow = head;

            for (int i = 0; i < n; i++) {

                fast = fast.next;

            }

            if (fast == null) {

                head = head.next;

                return head;

            }

            while (fast.next != null) {

                fast = fast.next;

                slow = slow.next;

            }

            slow.next = slow.next.next;

            return head;

        }

        public static void main(String[] args) {

            Node list = new Node(10);

            Node tem = list;

            tem.next = new Node(20);

            tem = tem.next;

            tem.next = new Node(30);

            tem = tem.next;

            tem.next = new Node(40);

            tem = tem.next;

            tem.next = new Node(60);

            printList(list);

            list = deleteNode(list,3);

            printList(list);

        }

    }


