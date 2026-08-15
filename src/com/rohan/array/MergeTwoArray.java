package com.rohan.array;

public class MergeTwoArray {
    public static void main(String[] args) {
        System.out.println("merging two array");
       int[] a = ArrayUtility.inputArray();
       int[] b = ArrayUtility.inputArray();

       int[] mergedArray = merge(a,b);
        System.out.println("Your merged Array is: ");
        ArrayUtility.displayArray(mergedArray);




    }
    public static int[] merge(int[] a, int[] b){
        int newSize = a.length + b.length;
        int[] c = new int[newSize];
      int i=0,j=0, k=0;
      while(i<a.length || j<b.length){
          if(j == b.length || i<a.length && (a[i] < b[j] )){
              c[k] = a[i];
              i++;
              k++;
          }
          else{
              c[k] = a[j];
              j++;
              k++;
          }
      }
      return c;

    }
}
