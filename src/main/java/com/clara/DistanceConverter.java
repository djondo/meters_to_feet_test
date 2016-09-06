package com.clara;

import java.util.Scanner;

public class DistanceConverter {

    static Scanner numberScanner = new Scanner(System.in);
    public static void main(String[] args) {
        // write your code here

        System.out.println("Please type in a distance in meters:");
        int meters = numberScanner.nextInt();

        int feet = metersToFeet(meters);

        System.out.println("In feet, that's " + feet + " ft");

        // End of your code here
        numberScanner.close();
    }


    public static int metersToFeet(int meters){
        //TODO! This method doesn't work yet. Can you fix it?
        //To convert meters to feet, multiply by 3
        int feet = meters * 3;

        return feet;
    }

    // I know doubles would be more real world but we are keeping it simple
    // int values are a little easier to test - doubles/float are not as precise
}
