package HW271022;

import java.util.Arrays;

public class PingPong {
    static int h = 27;
    static int w = 16;
    static char ch = '`';

    static String[][] array = new String[h][w];

    static void pingPongArray() {
        int posX = 0;
        int posY = 0;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                array[i][j] = String.valueOf(ch);
            }
        }

        for (int i = 0; i < w; i++) {
            array[i][i] = "$";
            posX++;
            posY++;
        }

        posX -= 2;

        for (int i = posY; i < h; i++) {
            array[posY][posX] = "$";
            posY++;
            posX --;
        }


        posY-=2;
        for (int i = posX; i >= 0; i--) {
            array[posY][i] = "$";
            posY--;
            posX--;
        }

        posX +=2;
        for (int i = posX; i < w; i++) {
            array[posY][posX] = "$";
            posY--;
            posX++;
        }

        Arrays.stream(array).map(Arrays::toString).forEach(System.out::println);

    }

    public static void main(String[] args) {
        pingPongArray();

    }
}
