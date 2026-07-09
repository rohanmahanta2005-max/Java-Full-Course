package com.rohan.ifelse;

import java.util.Scanner;

class PositiveNegative {
    public static void main(String[] args) {
        System.out.println("Welcome to Positive Negative Checker");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = input.nextInt();

        if(n == 0){
            System.out.println("The Number is neither positive nor negative");
        }
        else if(n>0){
            System.out.println(n + " is a positive Number");
        }
        else if(n<0){
            System.out.println(n + " is a negative number");
        }

    }
}
