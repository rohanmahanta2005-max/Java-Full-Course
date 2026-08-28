package com.rohan.array;

public class MergeTwoArray2 {
    public static void main(String[] args){
        int[] a ={2,3,4,5,6,7};
        int[] b ={1,12,45,54,90};

          int[] array = mergedarray(a,b);
        for(int ele: array){
            System.out.print(ele +" ");
        }

    }
    public static int[] mergedarray(int[] a, int[] b){
        int i=0,j=0,k=0;
        int[] c = new int[a.length + b.length];

        while(i<a.length && j<b.length){
            if (a[i] < b[j]){
                c[k] = a[i];
                i++;
            }
            else{
                c[k] = b[j];
                j++;
            }
            k++;
        }
        while(i < a.length){
            c[k] = a[i];
            i++;
            k++;
        }
        while(j < b.length){
            c[k] = b[j];
            j++;
            k++;
        }
        return c;
    }



}

