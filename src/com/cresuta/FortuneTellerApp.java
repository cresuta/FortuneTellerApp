package com.cresuta;

import java.util.Scanner;

public class FortuneTellerApp {

    public static void main(String[] args) {
        System.out.println("Hello, welcome to We Can Code IT's Fortune Teller Application!");
        Scanner input = new Scanner(System.in);

        System.out.println("What is your first name:");
        String firstName = input.nextLine();
//        System.out.println("Your first name is " + firstName);

        System.out.println("What is our last name:");
        String lastName = input.nextLine();
//        System.out.println("Your last name is " + lastName);

        System.out.println("What is your age:");
        int userAge = input.nextInt();
//        System.out.println("Your age is " + userAge);

        System.out.println("What is your birth month number:");
        int userBirthMonth = input.nextInt();
        input.nextLine();
//        System.out.println("Your birth month is " + userBirthMonth);

        System.out.println("What is your favorite ROYGBIV color, type HELP if you don't know their colors:");
        String favoriteColor = input.nextLine();
        if(favoriteColor.equalsIgnoreCase("help")){
            System.out.println("ROYGBIV stands for Red, Orange, Yellow, Green, Blue, Indigo, Violet");
            favoriteColor = input.nextLine();
        }
//        System.out.println("Your favorite color is " + favoriteColor);

        System.out.println("How many siblings do you have:");
        int siblingCount = input.nextInt();
//        System.out.println("You have " + siblingCount + " siblings.");

        // Years to retirement determined by siblingCount
        int yearsToRetirement = 0;
        if(userAge % 2 == 0){
            yearsToRetirement = 12;
        }else{
            yearsToRetirement = 14;
        }
//        System.out.println("Years to retirement: " + yearsToRetirement);

        // Vacation home location determined by siblingCount
        String vacationHomeLocation = "";
        if(siblingCount == 0){
            vacationHomeLocation = "Boca Raton, FL";
        }else if(siblingCount == 1){
            vacationHomeLocation = "Nassau, Bahamas";
        }else if(siblingCount == 2){
            vacationHomeLocation = "Ponta Negra, Brazil";
        }else if(siblingCount == 3){
            vacationHomeLocation = "Portland, Oregon";
        }else if(siblingCount > 3){
            vacationHomeLocation = "Baton Rouge, LA";
        }else{
            vacationHomeLocation = "Chernoybl, Ukraine";
        }
//        System.out.println("Your vacation home is in " + vacationHomeLocation);

        // Mode of transportation determined by favoriteColor
        String modeOfTransportation = "";
        switch (favoriteColor.toLowerCase()){
            case "red":
                modeOfTransportation = "Maserati";
                break;
            case "orange":
                modeOfTransportation = "Chariot";
                break;
            case "yellow":
                modeOfTransportation = "School Bus";
                break;
            case "green":
                modeOfTransportation = "Tesla";
                break;
            case "blue":
                modeOfTransportation = "Yugo";
                break;
            case "indigo":
                modeOfTransportation = "Honda Civic";
                break;
            case "violet":
                modeOfTransportation = "Motorcycle";
                break;
            default:
                modeOfTransportation = "Taxi Cab";
        }
//        System.out.println("Your mode of transportation will be a " + modeOfTransportation);

        // Bank balance determined by userBirthMonth
        double bankBalance = 0.0;
        if(userBirthMonth > 0 && userBirthMonth <= 4){
            bankBalance = 250000.99;
        }else if (userBirthMonth > 4 && userBirthMonth <= 8){
            bankBalance = 3365000.95;
        }else if (userBirthMonth > 8 && userBirthMonth <= 12){
            bankBalance = 45.65;
        }
//        System.out.println("You have a bank balance of: " + bankBalance);

        //Display final message of your fortune
        System.out.println(firstName + " " + lastName + " will retire in " + yearsToRetirement + " years" + "\n" +
                "with " + "$" + bankBalance + " in their bank account, " + "\n" + "a vacation home in " +
                vacationHomeLocation + "," + "\n" + "and they will drive a " + modeOfTransportation + ".");
    }
}

