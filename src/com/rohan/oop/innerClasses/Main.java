package com.rohan.oop.innerClasses;

class A{
    public static void display(){
        System.out.println("This is class A");
    }
    class B{
        public void show(){
            System.out.println("This is class B");
        }
    }
}

public class Main {

    static void main(String[] args){

        A obj = new A();
        A.display();
        A.B obj2 = obj.new B();
        obj2.show();// It means B belongs to A

    }



}