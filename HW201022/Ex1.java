package HW201022;

import java.util.Random;

public class Ex1 {
    static Random random = new Random();
    static int a;
   static int stopPosition = 3;

    static int[] getArray(int[] array) {
        if (array.length < stopPosition) {
            for (int i = 0; i < array.length; i++) {

                if (array[i] % 2 > 0) {
                    array[i] = array[i] + 1;
                }
            }
        } else if (array.length == stopPosition) {
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(100);
            }
        } else {
            for (int i = 0; i < stopPosition; i++) {
                array[i] = random.nextInt(100);
            }
            for (int i = 3; i < array.length; i++) {
                array[i] = array[i - 1] + array[i - 2] + array[i - 3];
            }
        }
        return array;
    }

    public static void outArray(int[] array) {
        for (int i : array) {
            System.out.println("***  " + i + "  ***");
        }
    }

    public static void main(String[] args) {
        int[] testArray = new int[24];
        outArray(getArray(testArray));
    }
}