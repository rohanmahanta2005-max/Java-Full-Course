package com.rohan;

public class Main {
    public static void display(){
        System.out.println("Hello World");

    }
    public static void main(String[] args) {
       display();
    }
}
class Student {
    private String name;
    private int roll;
    private int age;
    private String address;

    public Student(String name, int roll, int age, String address) {
        this.name = name;
        this.roll = roll;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}


