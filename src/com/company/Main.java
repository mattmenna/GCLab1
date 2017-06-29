package com.company;

/*
Calculate the perimeter and area of various classrooms at Grand Circus based on user input.

Build Specs:
Assume that the rooms are perfect retangles.
Assume that user will enter alid numeric data for length and width.
Accept decimal entries (12.5, for instance
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome to Grand Circus' Room Detail Generator!");
        System.out.println();

        // Variables
        float length;
        float width;
        float height;

        float aOutput;
        float pOutput;
        float vOutput;

        char cont;

// Program Loop as long as cont is not 'n'
        do {
            System.out.print("Enter Length: ");
            length = scnr.nextFloat();
            System.out.print("Enter Width: ");
            width = scnr.nextFloat();

            aOutput = area(length, width);
            pOutput = perimeter(length, width);

            System.out.println("Area is " + aOutput);
            System.out.println("Perimeter is " + pOutput);

            System.out.println("Do you want to calculate volume? (y/n)");
            if (scnr.next() != "n") {
                System.out.print("Enter Height: ");
                height = scnr.nextFloat();
                vOutput = volume(length, width, height);
                System.out.println("Volume is " + vOutput + "\n");
            }

            System.out.println("Do you want to continue? Please use y or n");
            cont = scnr.next().charAt(0);

        } while (cont != 'n');
    }

    private static float area(float length, float width) {
        float area = length * width;
        return area;
    }

    private static float perimeter(float length, float width) {
        float perimeter = 2 * length + 2 * width;
        return perimeter;
    }

    private static float volume(float length, float width, float height) {
        float volume = length * width * height;
        return volume;
    }
}