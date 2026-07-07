package com.rohan;

import java.util.Scanner;

class LeapYear{
    public static void main(String[] args) {
        System.out.println("Leap Year Checking...");
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter a Year: ");
        int y = input.nextInt();

        if (y % 400 == 0 || y % 4 == 0 && y % 100 != 0) {
            System.out.print(y + " Is a Leap year");
        } else {
            System.out.print(y + " is not a leap year");
        }
    }
}
