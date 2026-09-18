package com.rohan.Frameworks;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class setTutorial {
    public static void main(String[] args){
        HashSet<String> names = new HashSet<>();
        TreeSet<String> name = new TreeSet<>();
        LinkedHashSet<String> name2 = new LinkedHashSet<>();

        //How to add

        names.add("Tony");
        names.add("Tony");
        names.add("Stark"); //duplicate values will be cut automatically

        System.out.println(names);
        System.out.println(names.contains("Rohan"));

        // How to remove
        names.clear();            // used to clear the list
         names.remove("Tony");  // used to delete a specific item from a list
        System.out.println(names);

         for(String n: names){
             System.out.println(n);
         }

    }
}
