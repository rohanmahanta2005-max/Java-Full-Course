package com.rohan.ifelse;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        System.out.println("Nested Switch");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int empid = sc.nextInt();
        System.out.print("Enter Department: ");
        String department = sc.next();


        switch(empid){
            case 1:
                System.out.println("Rohan Singh");
                break;
            case 2:
                System.out.println("Rohan Kumar");
                break;
            case 3:   System.out.println("Employee number 3");

                switch(department){
                    case "It":
                        System.out.println("IT department");
                        break;
                    case "Mechanical":
                        System.out.println("Mechanical department ");
                        break;

                }
                break;
            default:
                System.out.println("Please enter a valid Employee id ...");
        }

    }
}
