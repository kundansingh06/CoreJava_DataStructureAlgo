package com.kundan.linkedlist;

public class SinglyLinkedList {
   Node head;
     static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    void printNode(){
        Node current=head;
        while(current!=null){
            System.out.println(current.data+" ");
            current=current.next;
        }

    }

    int countNode(){
         if (head==null){
             return 0;
         }
         int count=0;
        Node current=head;
        while(current!=null){
            count++;
            current=current.next;
        }
        return  count;
    }

    public static void main(String[] args) {
        SinglyLinkedList al =new SinglyLinkedList();
        al.head= new Node(10);
        Node second =new Node(20);
        Node third  =new Node(30);
        Node fourth =new Node(40);

        al.head.next=second;
        second.next=third;
        third.next=fourth;

        al.printNode();

        int a=al.countNode();
        System.out.println(a);


    }

}
