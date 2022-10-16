package Homework;

import java.util.Random;

public class Char {
    public static void main(String[] args) {
        char[] ch1 =  new char[0];
        Random random = new Random();
        char ch = (char) random.nextInt(65, 91);
        System.out.println(ch);
    }
}
