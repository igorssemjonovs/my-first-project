package lv.acodemy.classroom;

public class ifElse {
    public static void main(String[] args) {
        //IF
        /*
        if(condition)

         */
        boolean x = 5 > 2;
        System.out.println(x);

        if (x)
            System.out.println("Yes, 5 is more than 2");
        ;


        int evenNumber = 21;
        if (evenNumber % 2 == 0) {
            System.out.println("Number:" + evenNumber + " is even");
        } else {
            System.out.println("Number:" + evenNumber + " is NOT even");


            boolean isSummer = true;
            if (isSummer) {
                System.out.println("Summer months: June, July, August");

            }
            //if-else-if

            int age = 17;
            if (age <= 17) {
                System.out.println("You are not allowed to buy here!");
            } else if (age < 0) {
                System.out.println("Who are you?");
            } else {
                System.out.println("Welcome to our shop!");
            }
        }
    String name = "Max";
        if (name. equals("John")) {
            System.out.println("Hello John!");
        } else if (name.equals("Zina")) {
            System.out.println("You are not welcome!");
        } else {
            System.out.println("Very interesting name!");
        }

        int currentMonth = 4;
        switch (currentMonth) {
            case 12:
            case 1:
            case 2:
                System.out.println("This is winter");
                break;
            case 3:
            case 4:
            case 5:
                    System.out.println("This is spring");
                    break;
            case 6:
            case 7:
            case 8:
                        System.out.println("This is summer");
                        break;
            case 9:
            case 10:
            case 11:
                            System.out.println("This is autumn");
                            break;
        }

    }
}
