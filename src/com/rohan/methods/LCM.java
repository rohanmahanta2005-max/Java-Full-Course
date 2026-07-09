package com.rohan.methods;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        int first= read();
        int second = read();

        int result = lcm(first,second);
        System.out.print("THe LCM is " + result);
    }
    public static int read(){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }
    public static int lcm(int num1, int num2){
        int i = 1;
        while(i<=num2){
            int factor = num1*i;
            if(factor%num2==0){
                return factor;
            }
            i++;
        }
        return 0;

    }
}
