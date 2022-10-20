package HW201022;

import java.util.Arrays;
import java.util.Random;

public class Ex2 {
    static Random random = new Random();

    static void getReverseArray(int[] array) {

        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = random.nextInt(100);
        }
        System.out.println("reverseArray : " + Arrays.toString(array));
    }

    static void getFirstTwo(int[] array) {
        int[] array1 = new int[array.length];
        for (int i = 0; i < array.length - 2; i += 4) {
            array1[i] = array[i];
            array1[i + 1] = array[i + 1];
        }
        System.out.println("firstTwo : " + Arrays.toString(array1));
    }

    static void getProgression(int[] array) {
        int[] array2 = new int[array.length];
        for (int i = 0; i < array2.length; i++) {
            for (int j = i * i + i; j < (i + 1) * (i + 1); j++) {
                if (j < array.length) {
                    array2[j] = random.nextInt(100);
                }
            }
        }
        System.out.println("getProgression : " + Arrays.toString(array2));
    }

    static void getEven(int[] array) {
        int i = 0;
        int[] array3 = new int[array.length];
        while ( i < array.length) {
            array3[i] = random.nextInt(100);
            if(array3[i] % 2 != 0){
                array3[i] += 1;
            }
            i++;
        }
        System.out.println("getEven :" + Arrays.toString(array3));
    }

    static void getArray(int[] array){
        int i = 0;
        int[] array4 = new int[array.length]; {
            for (i = 0; i < (int)(array.length/2) ; i++) {
                array4[i] = random.nextInt(100);
                array4[array.length - i - 1] = random.nextInt(100);
            }
            if(i * 2 < array.length){
                array4[i] = random.nextInt(100);
            }
            System.out.println("getArray : " + Arrays.toString(array4));
        }
    }

    public static void main(String[] args) {
        int[] testArray = new int[25];
        getReverseArray(testArray);

        getFirstTwo(testArray);

        getProgression(testArray);

        getEven(testArray);

        getArray(testArray);
    }
}
