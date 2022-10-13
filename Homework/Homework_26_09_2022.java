package Homework;

public class Homework_26_09_2022 {


    static double getResult1(int num1, double num2) {
        return (num1 + num2)/(num1 - num2);
    }

    static float getResult2(int x1, float x2) {
        return (x1 * x1 + x2 * x2 + x2 - x1) / x1;
    }

    static void getResult3(int a, double b) {
        double c = (b * 4 + a / b) % a;
        System.out.println("result3 = " + c);
    }

    static void getResult4(int intNum, double doubleNum) {
        double res = (intNum * 2 - (intNum + doubleNum)) * intNum;
        System.out.println("result4 = " + res);
    }

    public static void main(String[] args) {
        System.out.println("result1 = " + getResult1(28, 56.9));
        System.out.println("result2 = " + getResult2(15, 9.4f));
        getResult3(4, 53.6);
        getResult4(8, 16.5);

        System.out.println(getResult1(54, getResult2(6, 23.7f)));
    }
}