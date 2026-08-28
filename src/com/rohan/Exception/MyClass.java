package com.rohan.Exception;

public class MyClass {
    public static <T extends String> void show(T n){      // generics
        System.out.println(n);                            // T for type
    }

    public static <T extends Number> void show(T num){
        System.out.println(num);
    }


    static void main( String [] args){
        show("Hello");
        show(123);

    }

}
