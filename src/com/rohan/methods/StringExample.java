package com.rohan.methods;
import java.util.Scanner;
public class StringExample {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your name: ");
      String naam = sc.nextLine();
      String result = myGreet(naam);
      System.out.println(result);
    }

    static String myGreet(String name){
      String message = "Hello " + name + " you are the boss..";
      return message;
    }
}
