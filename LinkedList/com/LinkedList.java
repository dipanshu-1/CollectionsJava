package LinkedList.com;

public class LinkedList{
    Node head=null;
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
        Node(){

        }
    }
    void add(LinkedList list,int val){
        Node node=new Node(val);
        if(list.head==null){
            list.head=node;
        }
       else{
           Node last=list.head;
           while (last.next!=null){
               last=last.next;
           }
           last.next=node;
        }
    }
    void delete(LinkedList list,int val){

        if(list.head.data==val){
            list.head=list.head.next;
        }
        else {
            Node last=list.head;
            Node prev=last;
            while (last.next!=null){
                int z=last.data;
                if(z==val){
                    prev.next=last.next;
                    break;
                }
                prev=last;
                last=last.next;

            }

        }
    }

    public static void main(String[] args) {




    }
}
