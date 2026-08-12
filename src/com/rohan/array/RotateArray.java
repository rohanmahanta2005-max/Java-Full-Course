package com.rohan.array;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        System.out.println("Rotating array d steps without considering another array..");
        int[] arr = {23, 54, 12, 55, 21, 90};
        System.out.print("Enter steps you want to rotate: ");
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        d = d % n;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);

        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }

    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
