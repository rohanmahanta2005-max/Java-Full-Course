package com.rohan.methods;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.println("factorial...");

        int n = read();
        int result = fact(n);
        System.out.println("Factorial of " + n + " is " + result);
    }
    public static int fact(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact=fact*i;
        }
        return fact;
    }
    public static int read(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
         return input.nextInt();

    }



}
