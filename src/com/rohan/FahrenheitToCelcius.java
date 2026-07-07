package com.rohan;

import java.util.Scanner;

class FahrenheitToCelcius {
    public static void main(String[] args) {
        System.out.println("Fahrenheit to Celcius Converter");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the temperature in FAHRENHEIT SCALE: ");

        Float F = input.nextFloat();
        float C = (F - 32)*5/9;

        System.out.println("Temperature in Celcius Scale: " + C + "Degree");
    }
}
