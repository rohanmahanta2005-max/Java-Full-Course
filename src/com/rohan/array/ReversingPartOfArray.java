package com.rohan.array;

public class ReversingPartOfArray {
    public static void main(String[] args) {
        System.out.println("Reversing part of array using Two Pointer Technique..\n");

        int[] arr = {15,54,53,23,25,12,9,4,50};
        int n = arr.length;
        int i = 2;
        int j = 5;                // Reversing elements from index 2 to 5
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        for (int ele : arr) System.out.print(ele + " ");
    }
}
