package com.cresuta;

import java.util.Scanner;

public class FortuneTellerApp {

    public static void main(String[] args) {
        System.out.println("Hello, welcome to We Can Code IT's Fortune Teller Application!");
        Scanner input = new Scanner(System.in);

        System.out.println("What is your first name:");
        String firstName = input.nextLine();
        System.out.println("Your first name is " + firstName);

        System.out.println("What is our last name:");
        String lastName = input.nextLine();
        System.out.println("Your last name is " + lastName);

        System.out.println("What is your age:");
        int userAge = input.nextInt();
        System.out.println("Your age is " + userAge);

        System.out.println("What is your birth month number:");
        int userBirthMonth = input.nextInt();
        input.nextLine();
        System.out.println("Your birth month is " + userBirthMonth);

        System.out.println("What is your favorite ROYGBIV color, type HELP if you don't know their colors:");
        String favoriteColor = input.nextLine();
        System.out.println("Your favorite color is " + favoriteColor);

        System.out.println("How many siblings do you have:");
        int siblingCount = input.nextInt();
        System.out.println("You have " + siblingCount + " siblings.");
    }
}

