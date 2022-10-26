package HW241022;

import java.util.Arrays;
import java.util.Scanner;

public class Ex {
    static int h;
    static int w;
    static Scanner scanner = new Scanner(System.in);

    static void fillArray() {
        System.out.println("Enter array width:");
        w = scanner.nextInt();
        System.out.println("Enter array height:");
        h = scanner.nextInt();

        int[][] array = new int[h][w];
        int k = 0;
        int dx = 0;

        while (w > -1 && h > -1) {


            for (int i = 0; i < w; i++) {
                array[dx][i + dx] = k;
                k++;
            }

            for (int j = 1; j < h; j++) {
                array[j + dx][w - 1 + dx] = k;
                k++;
            }

            for (int l = 0; l < w - 1; l++) {
                array[h - 1 + dx][w - 2 - l + dx] = k;
                k++;
            }
            for (int m = 1; m < h - 1; m++) {
                array[h - 1 - m + dx][dx] = k;
                k++;
            }
            w -= 2;
            h -= 2;
            dx++;
        }


        Arrays.stream(array).

                map(Arrays::toString).

                forEach(System.out::println);

    }

    public static void main(String[] args) {

        fillArray();
    }

}
