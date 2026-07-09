package com.rohan.methods;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        System.out.println("Multiplication Table");
        int n = read();
        display(n);
    }
    public static void display(int n){
        for(int i=1; i<=10; i++){
        System.out.println(n + " x " + i + " = " + n*i );
        }

    }
    public static int read(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        return num;

    }
}
