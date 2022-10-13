package Homework;

import java.util.Scanner;


public class Homework_28_09_2022 {


    static double getResult1(double a, double b) {
        return a * b / (a + b);
    }

    static void getResult2(double a, double b, double c) {
        double x = 4 * a * a + 3 * b + c;
        System.out.println("Result2 = " + x);
    }

    static double getResult3(double a) {
        return a * a;
    }

    static int getResult4(int a, int b) {
        return Math.min(a, b);
    }

    static double getResult5(double a) {
        return a * a;
    }

    static double getResult6(double a, double b) {
        return a - b;
    }

    static void getResult7(double a, double b) {
        double tempResult = (a * a + b * b) % 10;
        System.out.println("Result7 = " + tempResult);
    }

    static double getResult8(double a, double b, double c) {
        return (a + b - c) * (a + b - c);
    }

    static double getResult9(double a, double b) {
        return 2 * a * a + b;
    }

    static void getResult10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your birth year?");
        int y = scanner.nextInt();
        int res = 2022 - y;
        System.out.println("Result10 = " + res);
    }

    static void getResult11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1 number: ");
        double a = scanner.nextDouble();
        double res = a * 1.6;
        System.out.println("Result11 = " + res);
    }

    static void getResult12() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1 number: ");
        double a = scanner.nextDouble();
        double res = a * 5 - a / 5;
        System.out.println("Result12 = " + res);
    }

    static double getResult13(double a, double b) {
        return a / b;
    }

    static void getResult14() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a phrase: ");
        String str = scanner.nextLine();
        System.out.println("Result14 = " + str.length());
    }

    static double getResult15(double a, double b) {
        return a + b;
    }

    static double getResult16(double a, double b) {
        return a * b;
    }

    static double getResult17(double a) {
        return a % 5;
    }

    static double getResult18(double a, double b) {
        return (a + b) / 54;
    }

    static double getResult19(double a, double b) {
        return a + b - 2;
    }

    static double getResult20(int a, double b) {
        return a + b - b * b - a * a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 2 numbers: ");
        System.out.println("Result1 = " + getResult1(scanner.nextDouble(), scanner.nextDouble()));

        System.out.println("Input 3 numbers:");
        getResult2(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());

        System.out.println("Input 1 number: ");
        System.out.println("Result3 = " + getResult3(scanner.nextDouble()));

        System.out.println("Input 2 integer numbers: ");
        System.out.println("Result4 = " + getResult4(scanner.nextInt(), scanner.nextInt()));

        System.out.println("Input 1 number: ");
        System.out.println("Result5 = " + getResult5(getResult3(scanner.nextDouble())));

        System.out.println("Input 3 numbers: ");
        System.out.println("Result6 = " + getResult6(getResult3(scanner.nextDouble()), getResult4(scanner.nextInt(), scanner.nextInt())));

        System.out.println("Input 2 numbers: ");
        getResult7(scanner.nextDouble(), scanner.nextDouble());

        System.out.println("Input 3 numbers: ");
        System.out.println("Result8 = " + getResult8(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble()));

        System.out.println("Input 4 numbers: ");
        System.out.println("Result9 = " + getResult9(scanner.nextDouble(), getResult8(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble())));

        getResult10();

        getResult11();

        getResult12();

        System.out.println("Input 2 numbers: ");
        System.out.println("Result13 = " + getResult13(getResult3(scanner.nextDouble()), getResult5(scanner.nextDouble())));

        getResult14();

        System.out.println("Input 3 numbers: ");
        System.out.println("Result15 = " + getResult15(getResult3(scanner.nextDouble()), getResult13(scanner.nextDouble(), scanner.nextDouble())));

        System.out.println("Input 3 numbers: ");
        System.out.println("Result16 = " + getResult16(scanner.nextDouble(), getResult15(scanner.nextDouble(), scanner.nextDouble())));

        System.out.println("Input 2 numbers: ");
        System.out.println("Result17 = " + getResult17(getResult13(scanner.nextDouble(), scanner.nextDouble())));

        System.out.println("Input 2 numbers: ");
        System.out.println("Result18 = " + getResult18(getResult3(scanner.nextDouble()), getResult17(scanner.nextDouble())));

        System.out.println("Input 2 numbers: ");
        System.out.println("Result19 = " + getResult19(scanner.nextDouble(), getResult17(scanner.nextDouble())));

        System.out.println("Input 4 numbers: ");
        System.out.println("Result20 = " + getResult20(getResult4(scanner.nextInt(), scanner.nextInt()), getResult19(scanner.nextDouble(), scanner.nextDouble())));
    }

}
