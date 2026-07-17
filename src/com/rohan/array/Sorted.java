package com.rohan.array;

public class Sorted {
    public static void main(String[] args){
        int[] arr = ArrayUtility.inputArray();
      boolean increase = isIncreasing(arr);
      boolean decrease = isDecreasing(arr);
      if(increase || decrease){
          System.out.println("Array is Sorted");
      }
      else{
          System.out.println("Array is not Sorted!!");
      }

    } {
        System.out.println("Sorted checking...");


    }
    public static boolean isIncreasing(int[] arr){
        int i = 1;
        while(i < arr.length){
            if(arr[i] < arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isDecreasing(int[] arr){

        int j = 1;
        while(j < arr.length){
            if(arr[j] > arr[j-1]){
                return false;
            }
            j++;
        }
        return true;
    }
}

