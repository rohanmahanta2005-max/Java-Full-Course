package com.rohan.loops;

import java.util.Scanner;

public class occurance {
    static void main(String[] args) {
        System.out.println("occurance");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Enter digit which you wanna see occurance: ");
        int m = sc.nextInt();

        int count = 0;
        while (n != 0) {
            int lastdigit = n % 10;
            if (lastdigit == m) {
                count++;
            }
            n = n / 10;
        }

        System.out.println(count);
    }
}