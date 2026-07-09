package com.rohan.ifelse;

import java.util.Scanner;

 class Grades {
    public static void main(String[] args){
        System.out.println("Grade Checker....");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        float a = input.nextFloat();

        if(a >= 90){
            System.out.println("A division");
        }
        else if(a>=75){
            System.out.println("B division");
        }
        else if(a>=60){
            System.out.println("C division");
        }
        else if (a>=30){
            System.out.println("D division");
        }
        else{
            System.out.println("Fail!!");
        }


    }
}
