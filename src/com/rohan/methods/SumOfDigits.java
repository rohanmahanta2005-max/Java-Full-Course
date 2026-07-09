package com.rohan.methods;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int result = add(n);
        System.out.println("SUM of the digits is "+ result);
    }
    public static int add(int n){
        int sum = 0;
        while(n!=0){
            int lastdigit = n%10;
            sum = sum +lastdigit;
            n = n/10;
        }
        return sum;
    }
}
