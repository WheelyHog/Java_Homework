package Homework;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;


public class HW151022 {
    static int[] charArray = {};


    public static void getCharArray(int[] charArray) {

//        System.out.println(charArray);
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr1 = new int[22];
        System.out.println(Arrays.toString(arr1));
        int i = 0;
        while (i < arr1.length - 1) {
            arr1[i] = random.nextInt(1, 100);
            i++;
        }
        System.out.println(Arrays.toString(arr1));


        System.out.println(Arrays.toString(arr1));

        for (i = 0; i < 10; i++) {
            charArray[i] = random.nextInt(1, 60);

        }
        System.out.println(Arrays.toString(arr1));

        for (i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(1, 100);
        }
        getCharArray(charArray);

    }
}
