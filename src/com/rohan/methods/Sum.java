package com.rohan.methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args){

        int ans = sum1();
        System.out.print("The sum is " + ans);
    }



    static int sum1(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();
        return num1+num2;
    }
}





