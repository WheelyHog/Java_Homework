package Homework;


import java.util.Arrays;
import java.util.Random;


public class HW151022 {

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

        for (int b : arr1) {
            b = random.nextInt(20, 50);
            System.out.println(b);
        }


        for (i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(60, 93);
        }
        System.out.println(Arrays.toString(arr1));

        for (i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(60, 93);
            System.out.println(arr1[i]);
            if (arr1[i] == 67) {
                System.out.println("You Win!!! Your number is 67!");
            } else if (arr1[i] == 75) {
                System.out.println("You Win!!! Your number is 67!");
            } else System.out.println("You Loose!");
        }
    }
}
