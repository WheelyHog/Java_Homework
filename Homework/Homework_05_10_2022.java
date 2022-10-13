package Homework;

public class Homework_05_10_2022 {
    public static void main(String[] args) {
        int i = 225;
        double d = 23.7;
        float f = 1233473.05f;
        long l = 568737376;



        byte b1 = (byte) i;
        System.out.println("int to byte --> " + b1);

        byte b2 = (byte) f;
        System.out.println("float to byte --> " + b2);

        int i2 = (int) d;
        System.out.println("double to int --> " + i2);

        short sh1 = (short) l;
        System.out.println("long to short --> " + sh1);

        double d2 = (double) l;
        System.out.println("long to double --> " + d2);

        char ch1 = (char) i;
        System.out.println("int to char --> " + ch1);

        char ch2 = (char) l;
        System.out.println("long to char --> " + ch2);

        short sh2 = (short) f;
        System.out.println("float to short --> " + sh2);

    }
}
