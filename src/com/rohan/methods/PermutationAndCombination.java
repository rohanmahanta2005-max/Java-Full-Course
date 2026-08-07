package com.rohan.methods;

import java.util.Scanner;

public class PermutationAndCombination {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPermutation and combination calculator...\n");

        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter r : ");
        int r = sc.nextInt();

        int nfact = factorial(n);
        int rfact = factorial(r);
        int nrfact = factorial(n-r);

        int nCr = nfact/(rfact*nrfact);
        int nPr = nfact/nrfact;

        System.out.println("Result of nCr: " + nCr);
        System.out.print("Result of nPr: " + nPr);

    }
    public static int factorial(int x){
        int Fact = 1;
        for(int i=1; i<=x; i++){
            Fact *= i;
        }
        return Fact;
    }

}
