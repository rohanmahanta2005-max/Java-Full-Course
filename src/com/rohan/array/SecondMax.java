package com.rohan.array;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {12, 38, 57, 20, 4, 55, 75};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
        }


        System.out.println("The first maximum element is "+ max);
        System.out.println("The second maximum element is "+ smax);

    }
}