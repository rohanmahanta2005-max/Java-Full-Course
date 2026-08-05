package com.rohan.Patterns;

public class OddNumbersTriangle {
    public static void main(String[] args) {
        System.out.print("Enter Rows: ");
        int row = input.num();

        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print( (2*j-1) + " ");

            }
            System.out.println();
        }
    }
}


//               for(int i=1; i<=row; i++){
//              int a = 1;
//            for(int j=1; j<=i; j++){
//                System.out.print(a + " ");                  ANOTHER APPROACH
//
//            }
//            System.out.println();
//        }


