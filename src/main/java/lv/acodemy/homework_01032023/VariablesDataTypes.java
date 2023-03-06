package lv.acodemy.homework_01032023;

public class VariablesDataTypes {
    public static void main(String[] args) {

        String name = "Igors";
        String surName = "Semjonovs";
        byte myCurrentAge =18;
        String fullName = name +" "+ surName;


        String myAdress = "Carnikava, Rotu iela";
        byte myAdressNumber =9;
        String fullAdress = myAdress +" "+ myAdressNumber;


        System.out.printf("My full name is: %s. I am %d years old.\n", fullName, myCurrentAge);
        System.out.printf("My home adress is : %s.\n", fullAdress);


        int a = 17;
        int b = 17;
        int c = a*b;
        System.out.printf ("Do you know how much is 17*17?\n");
        System.out.printf ("Yes, it is "); System.out.println(c);

        int q = 20;
        int w = 207;
        int e = q+w;
        System.out.printf ("And how much is 20+20?\n");
        System.out.printf ("It is "); System.out.println(e);

        System.out.printf ("If a = 17 and b = 17\n");
            System.out.println("a + b = " + (a + b));
            System.out.println("a - b = " + (a - b));
            System.out.println("a * b = " + (a * b));
            System.out.println("a / b = " + (a / b));
            System.out.println("a % b = " + (a % b));

        System.out.printf ("Thank you, bye..\n");


    }
}
