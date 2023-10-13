import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        startOperation();
    }

    static void startOperation() {
        int op;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to my Metric Converter!");
        System.out.println("Enter the number corresponding to the operation you want preformed.");
        System.out.println("1. Celsius to Fahrenheit \n2. Kilogram to Pounds \n" +
                "3. Kilometer to Mile \n4. Meter to Feet \nEnter -1 to exit");

        while (true) {
            try {
                op = scanner.nextInt();
                if(op == 1) {
                    tempConversion();

                } else if (op == 2) {
                    kilogramToPounds();

                } else if (op == 3) {
                    kilometerToMile();

                } else if (op == 4) {
                    meterToFeet();

                } else if (op == -1) {
                    System.out.println("Shutting Down... Goodbye!");
                    System.exit(0);
                } else {
                    System.out.println("Invalid input, please input 1, 2, 3, 4, or -1 as per the menu instructions.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input, please input 1, 2, 3, 4, or -1 as per the menu instructions.");
                scanner.nextLine();
            }
        }
    }

    static void tempConversion() {
        double input;
        double result;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your value of Celsius or return to menu with -274");
        while (true) {
            try {

                input = scanner.nextDouble();
                if (input == -274) {
                    scanner.nextLine();
                    startOperation();
                } else {
                    result = (input * 1.8) + 32;
                    System.out.println(input + "° Celsius is " + result + "° Fahrenheit");
                }
                scanner.nextLine();
                System.out.println("Enter another value or exit to menu with -274");

            } catch (Exception e) {
                System.out.println("Invalid input, please use a numerical value");
                scanner.nextLine();

            }
        }

    }

    static void kilogramToPounds() {
        double input;
        double result;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your value of Kilogram(s) or return to menu with -1");
        while (true) {
            try {

                input = scanner.nextDouble();
                if (input == -1) {
                    scanner.nextLine();
                    startOperation();
                } else {
                    result = input * 2.2046;
                    System.out.println(input + " Kilogram(s) is " + result + " Pound(s)");
                }
                scanner.nextLine();
                System.out.println("Enter another value or exit to menu with -1");

            } catch (Exception e) {
                System.out.println("Invalid input, please use a numerical value");
                scanner.nextLine();

            }
        }

    }

    static void kilometerToMile () {
        double input;
        double result;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your value of Kilometer(s) or return to menu with -1");
        while (true) {
            try {

                input = scanner.nextDouble();
                if (input == -1) {
                    scanner.nextLine();
                    startOperation();
                } else {
                    result = input * 0.6214;
                    System.out.println(input + " Kilometer(s) is " + result + " Mile(s)");
                }
                scanner.nextLine();
                System.out.println("Enter another value or exit to menu with -1");

            } catch (Exception e) {
                System.out.println("Invalid input, please use a numerical value");
                scanner.nextLine();

            }
        }

    }

    static void meterToFeet() {
        double input;
        double result;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your value of Meter(s) or return to menu with -1");
        while (true) {
            try {

                input = scanner.nextDouble();
                if (input == -1) {
                    scanner.nextLine();
                    startOperation();
                } else {
                    result = input * 3.2808;
                    System.out.println(input + " Meter(s) is " + result + " Feet");
                }
                scanner.nextLine();
                System.out.println("Enter another value or exit to menu with -1");

            } catch (Exception e) {
                System.out.println("Invalid input, please use a numerical value");
                scanner.nextLine();

            }
        }
    }
}

