package PingPong;

import java.util.Arrays;

public class PingPong {
    static char ch = '`';

    public static void createArray(int length, int height) {
        String[][] array = new String[height][length];
        isCube(array);
        fillLength(array);

        if (isCube(array)) {
            diagonal(array);
        } else fillArray(array);
        Arrays.stream(array).map(Arrays::toString).forEach(System.out::println);
    }

    private static void fillArray(String[][] array) {
        int posX = 0;
        int posY = 0;
        if (array[0].length > array.length) {

            for (int i = 0; i < array.length; i++) {
                array[i][i] = "$";
                posX++;
                posY++;
            }

            posY -= 2;
            for (int i = posX; i < array[0].length; i++) {
                array[posY][i] = "$";
                posY--;
                posX = i;
            }

            posX--;
            for (int i = posY; i >= 0; i--) {
                array[i][posX] = "$";
                posY--;
                posX--;
            }

            posY += 2;
            for (int i = posY; i < array.length; i++) {
                array[i][posX] = "$";
                posX--;
            }
        } else {
            for (int i = 0; i < array[0].length; i++) {
                array[i][i] = "$";
                posX++;
                posY++;
            }

            posX -= 2;

            for (int i = posY; i < array.length; i++) {
                array[posY][posX] = "$";
                posY++;
                posX--;
            }

            posY -= 2;
            for (int i = posX; i >= 0; i--) {
                array[posY][i] = "$";
                posY--;
                posX--;
            }

            posX += 2;
            for (int i = posX; i < array[0].length; i++) {
                array[posY][posX] = "$";
                posY--;
                posX++;
            }
        }
    }

    private static void diagonal(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = "$";
            array[array.length - i - 1][i] = "$";
        }
    }

    static void fillLength(String[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = String.valueOf(ch);
            }
        }
    }

    static boolean isCube(String[][] array) {
        return array.length == array[0].length;
    }

    public static void main(String[] args) {
        createArray(10, 15);
    }
}