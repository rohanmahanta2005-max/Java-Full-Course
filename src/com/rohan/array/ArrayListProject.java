package com.rohan.array;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
         boolean isTrue = true;
         while(isTrue){
             System.out.println();
             System.out.println("...MENU...");
             System.out.println("1. Add Task");
             System.out.println("2.View Task");
             System.out.println("3.Delete Task");
             System.out.println("4.Exit");
             System.out.print("Enter your choice: ");
             int choice = sc.nextInt();
             sc.nextLine();     // consumes one line , only happens for Int


             switch(choice){
                 case 1:
                     System.out.print("Enter task = ");
                     String task = sc.nextLine();
                     tasks.add(task);
                     System.out.println("Your Task is Recorded!!");
                     break;
                 case 2:
                     System.out.println("Your Task: ");
                     for(int i=0; i<tasks.size();i++){
                         System.out.println(tasks.get(i));
                     }
                     break;
                 case 3:
                     System.out.print("Enter number of task which you want to delete = ");
                     int index = sc.nextInt();
                     if(index>=0 && index<=tasks.size()){
                         tasks.remove(index-1);
                     }
                     else{
                         System.out.println("task not exist...");
                         break;
                     }

                     System.out.println("Task is deleted successfully!!");
                     break;
                 case 4:
                     isTrue = false;
                     break;
                 default:
                     System.out.println("Invalid choice..");
             }
         }
    }
}
