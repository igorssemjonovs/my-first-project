package lv.acodemy.classroom;

import java.util.Arrays;

public class VariablesDataTypes {
    public static void main(String[] args) {

        // byte data type
        byte myCurrentAge = 18;
        System.out.println(myCurrentAge);

        short salaryPerMonth = 3000;
        System.out.println(salaryPerMonth);

        char firstNameLetter = 119;
        System.out.println(firstNameLetter);

//  int data type
        int dateOfBirth = 291188;
        System.out.println(dateOfBirth);

        //long data type
        long populationOfLatvia = 18800000;
        System.out.println(populationOfLatvia);

        //float data type
        float lapTime = 32.30F;
        System.out.println(lapTime);

        //double data type
        double weight = 71.5;
        System.out.println(weight);

        //boolean is; has;
        boolean isWinter = false;
        boolean isSummer = true;
        System.out.println(isSummer);
        System.out.println(isWinter);

        //String
        String name = "Igors";
        String surName = "Semjonovs";


        //Concatenation
        String fullName = name +" "+ surName;
        System.out.println(fullName);

        String fullNameWithAge = fullName + myCurrentAge;
        System.out.println(fullNameWithAge);

        System.out.printf("My full name is: %s. I am %d years old.\n", fullName, myCurrentAge);
        System.out.printf("My full name is: %s. I am %d years old.\n", fullName, myCurrentAge);

        // *
        int a = 100;
        int b = 20;
        int c = a *b;
        System.out.println(c);

        // / division
        c = a / b;
        System.out.println(c);

        // %
        int number = 10 % 4;
        System.out.println(number);

        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(numbers));

        




    }
}
