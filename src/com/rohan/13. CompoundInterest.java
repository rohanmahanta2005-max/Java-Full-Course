package com.rohan;

import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        System.out.println("Simple Interest Calculation");
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter P: ");
        int P = input.nextInt();

        System.out.print("Enter R: ");
        Float R = input.nextFloat();

        System.out.print("Enter T: ");
        Float T = input.nextFloat();

        Double SimpleInterest = P*Math.pow((1+R/100),T);

        System.out.println("Calculated Compound Interest: Rs." + SimpleInterest);
    }
}
