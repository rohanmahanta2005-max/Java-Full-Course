package com.rohan.methods;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Prime number checker...");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();


        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                System.out.println("The Number is not Prime..");
                return;
             }
            }
        System.out.print("The number is Prime");
        }
    }
