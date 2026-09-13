package com.rohan.Lists;
import java.util.Scanner;



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

    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }


        Node current = head;
        while (current.next!= null) {
            current = current.next;            // inserting Node at the ending
        }
        current.next = newNode;
        newNode.next = null;
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
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            System.out.print("Enter node "+ i + " value: ");
            list.add(sc.nextInt());
        }
        list.PrintList();
    }

    }





