package HW271022;

import java.util.Arrays;

public class PingPong {
    static int h = 30;
    static int w = 30;
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
        System.out.println(posX + " " + posY);
        for (int i = 0; i < w; i++) {
            array[i][i] = "$";
            posX++;
            posY++;
        }
        System.out.println(posX + " " + posY);
        posX -= 2;

        for (int i = posY; i < h; i++) {
            array[posY][posX] = "$";
            posY++;
            posX --;
        }
        System.out.println(posX + " " + posY);

        posY-=2;
        for (int i = posX; i >= 0; i--) {
            array[posY][i] = "$";
            posY--;
            posX--;
        }
        System.out.println(posX + " " + posY);
        posX +=2;
        for (int i = posX; i < w; i++) {
            array[posY][posX] = "$";
            posY--;
            posX++;
        }

        Arrays.stream(array).map(Arrays::toString).forEach(System.out::println);
        System.out.println(array.length +" " + array[0].length);
    }

    public static void main(String[] args) {
        pingPongArray();

    }
}
