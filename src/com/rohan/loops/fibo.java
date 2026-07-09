package com.rohan.loops;
import java.util.Scanner;

public class fibo {
    public static void main(String[] args){
        System.out.println("Fibonacci series");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int a=0;
        int b = 1;
        int sum;

        for(int i=1; i<=n; i++){
            System.out.println(a);
            sum=a+b;
            a = b;
            b = sum;


        }

    }
}
