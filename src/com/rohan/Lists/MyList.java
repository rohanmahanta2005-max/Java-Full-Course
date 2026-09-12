package com.rohan.Lists;
import java.util.LinkedList;
public class MyList {
    public static void main(String[] args) {
        LinkedList<String>  MyList = new LinkedList<>();
        MyList.addFirst("1");
        MyList.addLast("2");                // inbuild methods of Linked List;
        System.out.println("First element: "+ MyList.getFirst());
        System.out.println("Last element: "+ MyList.getLast());

    }
}
