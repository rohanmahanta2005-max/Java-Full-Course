package com.rohan;

import java.util.Scanner;

class Perimeter{
    public static void main(String[] args) {
        System.out.println("com.rohan.Perimeter of A REctangle");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A: ");
        int A = input.nextInt();
        System.out.print("Enter B: ");
        int B = input.nextInt();
        System.out.print("Enter C: ");
        int C = input.nextInt();
        System.out.print("Enter D: ");
        int D = input.nextInt();

        int perimeter = A+B+C+D;

        System.out.println("The perimeter of the rectangle: " + perimeter + "cm");

    }

}

