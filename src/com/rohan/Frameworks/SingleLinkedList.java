package com.rohan.Frameworks;



public class SingleLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    // Inserting Node at First
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
     // Inserting Node at Last
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next!= null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.next = null;
    }
    // Delete Node from First
    public void removeFirst(){
        if(head  == null){
            return;
        }
        head = head.next;
    }
    //Deleting Node from Last
    public void removeLast(){
        if(head == null){
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node current = head;
        while(current.next.next!=null){
            current = current.next;
        }
        current.next = null;
    }

        void PrintList () {
        Node current = head;
            while (current!= null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
         list.addFirst(10);
         list.addLast(20);
         list.addFirst(5);

        list.PrintList();
    }

    }





