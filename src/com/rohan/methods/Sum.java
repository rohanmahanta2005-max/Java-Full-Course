package com.rohan.methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        greet();
        int first = read();
        int second = read();
        int sum = first + second;
        System.out.print("The sum is " + sum);
    }
  public static void greet(){
      System.out.println("Welcome to calculator..");
  }
  public static int read(){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int num = sc.nextInt();
      return num;
  }


}





