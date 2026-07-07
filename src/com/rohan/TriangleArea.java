package com.rohan;

import java.util.Scanner;

class TriangleArea {
   public static void main(String[] args) {
       System.out.println("Area of a Triangle");
       Scanner input = new Scanner(System.in);
       System.out.print("Enter Base: ");
       Double Base = input.nextDouble();
       System.out.println("Now Please Enter Height: ");
       Double Height = input.nextDouble();

       Double Area = (Base*Height)/2;

       System.out.println("Area of the Triangle: " + Area + "cms");
    }


}
