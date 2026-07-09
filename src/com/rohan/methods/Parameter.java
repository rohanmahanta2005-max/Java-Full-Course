package com.rohan.methods;

import java.util.Scanner;

public class Parameter {
   public static void main(String[] args) {
       greet();
       int num1 = read();
       int num2 = read();
       int result = sumTwoNumbers(num1,num2);
       System.out.println("The sum is "+result);

    }
    public static int read(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = sc.nextInt();
        return num;
    }

    public static int sumTwoNumbers(int first,int second){
       int sum = first + second;
       return sum;
    }
    public static void greet(){
       System.out.print("Hello User...\n");
    }
}
