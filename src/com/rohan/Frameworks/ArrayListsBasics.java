package com.rohan.Frameworks;
import java.util.ArrayList;

public class ArrayListsBasics {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);   // index 0
        arr.add(21);   // index 1
        arr.add(18);   // index 2
        arr.add(5);     //index 3
        arr.add(10);    //index 4

        arr.add(1,18);
        System.out.println("this is: " +arr);        // interchange element of index 1 with index 2


        System.out.println(arr.get(3));  // instead of arr[2]
        arr.set(3,50);  // arr[3] = 50

        System.out.println(arr);   // not traversing the array by our selves
        int n = arr.size();
        for(int i=0; i<n; i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        //25,21,18,50,10,78
        arr.add(78);
        arr.add(1,100);  // used to insert element between two elements
        System.out.print(arr);
        System.out.println();

        arr.remove(arr.size()-1);  //used to remove the last element of the array
        System.out.println(arr);

        arr.clear();                          // this is used to clear the arraylist
        System.out.println("this: " + arr);

        int i=0; int j = arr.size()-1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));          // rarely used to manually
            arr.set(j,temp);
            i++;
            j--;
        }


       // Collections.reverse(arr);   // used to reverse an arraylist
        // Collections.sort(arr);    // used to sort an arrayList


        System.out.print(arr);
        ArrayList<Character> arr2 = new ArrayList<>();
        ArrayList<String> arr3 = new ArrayList<>();
    }
}
