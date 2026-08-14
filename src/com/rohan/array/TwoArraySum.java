package com.rohan.array;
import java.util.ArrayList;
import java.util.Collections;

public class TwoArraySum {

    void solve(int[] arr, int[] arr2) {

        ArrayList<Integer> arr3 = new ArrayList<>();

        int i = arr.length - 1;
        int j = arr2.length - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {

            int sum = carry;

            if (i >= 0) {
                sum += arr[i];
                i--;
            }

            if (j >= 0) {
                sum += arr2[j];
                j--;
            }

            arr3.add(sum % 10);

            carry = sum / 10;
        }

        Collections.reverse(arr3);

        for (int s : arr3) {
            System.out.print(s + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 5, 6, 7};

        TwoArraySum solv1 = new TwoArraySum();

        solv1.solve(arr, arr2);
    }
}