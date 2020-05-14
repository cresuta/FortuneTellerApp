package com.cresuta;

import java.util.Scanner;

public class FortuneTellerApp {

    public static void main(String[] args) {
        System.out.println("Hello, welcome to We Can Code IT's Fortune Teller Application!");
        Scanner input = new Scanner(System.in);

        // Method calls
        String firstName = getFirstName(input);
        String lastName = getLastName(input);
        int userAge = getUserAge(input);
        int userBirthMonth = getUserBirthMonth(input);
        input.nextLine();
        String favoriteColor = getFavoriteColor(input);
        int siblingCount = getSiblingCount(input);
        int yearsToRetirement = getYearsToRetirement(input, userAge);
        String vacationHomeLocation = getVacationHomeLocation(input, siblingCount);
        String modeOfTransportation = getModeOfTransportation(input, favoriteColor);
        double bankBalance = getBankBalance(userBirthMonth);

        //Display final message of your fortune
        System.out.println(firstName + " " + lastName + " will retire in " + yearsToRetirement + " years" + "\n" +
                "with " + "$" + bankBalance + " in their bank account, " + "\n" + "a vacation home in " +
                vacationHomeLocation + "," + "\n" + "and they will drive a " + modeOfTransportation + ".");
    }

    public static String getFirstName(Scanner input){
        System.out.println("What is your first name:");
        return input.nextLine();
    }

    public static String getLastName(Scanner input){
        System.out.println("What is your last name:");
        return input.nextLine();
    }

    public static int getUserAge(Scanner input){
        System.out.println("What is your age:");
        return input.nextInt();
    }

    public static int getUserBirthMonth(Scanner input) {
        System.out.println("What is your birth month number:");
        int birthMonth = input.nextInt();
        while(birthMonth < 1 || birthMonth > 12){
            System.out.println("Birth Month number must be between 1 and 12:");
            birthMonth = input.nextInt();
        }
        return birthMonth;

    }

    public static String getFavoriteColor(Scanner input){
        System.out.println("What is your favorite ROYGBIV color, type HELP if you don't know their colors:");
        String favoriteColor = input.nextLine();
        if(favoriteColor.equalsIgnoreCase("help")){
            System.out.println("ROYGBIV stands for Red, Orange, Yellow, Green, Blue, Indigo, Violet");
            favoriteColor = input.nextLine();
        }
        return favoriteColor;
    }

    public static int getSiblingCount(Scanner input) {
        System.out.println("How many siblings do you have:");
        return input.nextInt();
    }

    public static int getYearsToRetirement(Scanner input, int userAge) {
        int yearsToRetirement = 0;
        if(userAge % 2 == 0){
            yearsToRetirement = 12;
        }else{
            yearsToRetirement = 14;
        }
        return yearsToRetirement;
    }

    public static String getVacationHomeLocation(Scanner input, int siblingCount) {
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
        return vacationHomeLocation;
    }

    public static double getBankBalance(int userBirthMonth){
        double bankBalance = 0.0;
        if(userBirthMonth > 0 && userBirthMonth <= 4){
            bankBalance = 250000.99;
        }else if (userBirthMonth > 4 && userBirthMonth <= 8){
            bankBalance = 3365000.95;
        }else if (userBirthMonth > 8 && userBirthMonth <= 12){
            bankBalance = 45.65;
        }
        return bankBalance;
    }

    public static String getModeOfTransportation(Scanner input, String favoriteColor){
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
        return modeOfTransportation;
    }
}

