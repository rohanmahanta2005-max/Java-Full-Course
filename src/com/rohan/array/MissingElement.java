package com.rohan.array;

public class MissingElement {
    public static void main(String[] args){
        System.out.println("Given an array of size n-1 of range 1 to n, find missing element");
        int[] arr = {1,2,3,4,6};
        long n = arr.length + 1;

        long Sum = n*(n+1)/2;
        long ArraySum = 0;

        for(int ele : arr) ArraySum += ele;

        long result = Sum-ArraySum;

        System.out.print("The missing element is: "+ result);

    }
}
