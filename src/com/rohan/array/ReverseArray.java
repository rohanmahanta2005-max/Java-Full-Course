package com.rohan.array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {15,54,53,23,25,12,9,4,50};
        int n = arr.length;
        int i = 0;
        int j = arr.length - 1;

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
