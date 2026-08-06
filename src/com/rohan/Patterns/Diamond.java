package com.rohan.Patterns;

public class Diamond {
    public static void main(String[] args){
        System.out.print(" Enter rows: ");
        int n = input.num();
        int nsp = n-1; int nst = 1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=nsp; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=nst; j++){
                System.out.print("X ");
            }
            nsp --;
            nst +=2;
            System.out.println();
        }
         nsp = 1;
        nst = 2*n-3;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=nsp; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=nst; j++){
                System.out.print("X ");
            }
            nsp ++;
            nst -=2;
            System.out.println();
        }

        }

    }

