package com.rohan;

import java.util.Scanner;

class GreatestOfThree {
    public static void main(String[] args) {
        System.out.println("Greatest of three ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = input.nextInt();
        System.out.print("Enter b: ");
        int b = input.nextInt();
        System.out.print("Enter c: ");
        int c = input.nextInt();
        if(a>b && a>c) System.out.println(a + " is greatest among all!!");
        else if(b>a && b>c) System.out.println(b + " is greatest among all!!");
        else if(c>a && c>b) System.out.println(c + " is greatest among all!!");

    }
}
