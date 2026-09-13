package com.rohan.Lists;



public class DoubleLinkedList {
    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;

    // Add First Method
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    // inserting Node at the last

    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head==null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
        newNode.next = null;
    }

    //Remove First Node
     public void removeFirst() {

         if (head == null) {
             System.out.println("List is empty");
             return;
         }
         head = head.next;
         head.prev = null;
     }
     //Remove Last Node
    public void removeLast(){
        if (head == null){
            System.out.println("List is empty...");
            return;
        }
        Node current =  head;
        while(current.next!=null){
            current =  current.next;
        }
        current.prev.next = null;
    }

    // Print the double linked list forward
    public void PrintListForward () {
        Node current = head;
        while (current!= null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    // Print the double linked list Backward
    void PrintListBackward () {
       if(head == null){
           System.out.println("List is empty...");
           return;
       }
       Node current = head;
       while(current.next!=null){
           current = current.next;
       }
       while(current!= null){
           System.out.print(current.data + " <- ");
           current = current.prev;
       }
        System.out.println("null");

    }

    public static void main(String[] args){
        DoubleLinkedList list = new DoubleLinkedList();
        list.addFirst(10);
        list.addLast(20);
        list.PrintListBackward();

    }

}

