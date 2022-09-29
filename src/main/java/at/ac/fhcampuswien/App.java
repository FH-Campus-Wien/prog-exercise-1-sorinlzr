package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    public void helloRobot(){
        System.out.println("0123456789012345678901\r\n" +
                "         __\r\n" +
                " _(\\    |@@|\r\n" +
                "(__/\\__ \\--/ __\r\n" +
                "   \\___|----|  |   __\r\n" +
                "       \\ }{ /\\ )_ / _\\\r\n" +
                "       /\\__/\\ \\__O (__\r\n" +
                "      (--/\\--)    \\__/\r\n" +
                "      _)(  )(_\r\n" +
                "     `---''---`");
    }

    public void sumOfLiterals(){
        final char numChar = 'Z';
        final int numHex = 0xface;
        final int numOctal = 012;
        final long numLong = 80L;
        final float numFloatExp = 44e-1f;
        final float numFloat = 5.5f;
        final double numDoubleExp = 8.88e1;
        final double numDouble = 99.9;

        int sum = (int) numChar + numHex + numOctal + (int) numLong
                + (int) numFloatExp + (int) numFloat + (int) numDoubleExp + (int) numDouble;
        System.out.println(sum);
    }

    public void addTwoNumbers(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(a+b);
    }

    public void swapTwoNumbers(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Before Swap:");
        System.out.print("x: ");
        int x = scan.nextInt();

        System.out.print("y: ");
        int y= scan.nextInt();

        x = x ^ y;
        y = y ^ x;
        x = x ^ y;

        System.out.println("After Swap:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner scan = new Scanner(System.in);

        System.out.print("n1: ");
        int n1 = scan.nextInt();

        System.out.print("n2: ");
        int n2 = scan.nextInt();

        if (n1 > n2) System.out.println("n1 > n2");
        if (n2 > n1) System.out.println("n2 > n1");
        if (n1 == n2) System.out.println("n1 == n2");
    }

    public void ratingSalesPerson(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter annual Revenue: ");
        int revenue = scan.nextInt();

        if (revenue < 0 || revenue >= 100000) {
            System.out.println("Invalid Revenue");
        } else if (revenue < 20000) {
            System.out.println("Poor Sales Revenue");
        } else if (revenue < 50000) {
            System.out.println( "Average Sales Revenue");
        } else if (revenue < 80000) {
            System.out.println("Good Sales Revenue");
        } else {
            System.out.println("Excellent Sales Revenue");
        }
    }

    public void getCommissionRate(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter CommissionClass: ");
        int commissionClass = scan.nextInt();
        double provision;

        switch (commissionClass) {
            case (1):
                provision = 0.01;
                break;
            case (2):
                provision = 0.02;
                break;
            case (3):
                provision = 0.03;
                break;
            case (4):
                provision = 0.04;
                break;
            default:
                provision = 0.00;
        }
        System.out.println("Your Commission Rate was set to " + provision);
    }

    public void leapyear(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Year: ");
        int year = scan.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Leapyear");
        } else {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Number: ");
        int number = scan.nextInt();

        if (number > 999) return;

        int res = number % 10 * 100 + number / 10 % 10 * 10 + number / 100;
        System.out.println(res);
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}