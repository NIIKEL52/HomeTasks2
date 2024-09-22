package ee.Task4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 50) * 2;
        }

        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();

        int average = 0;
        for (int val : arr) {
            if (val != min && val != max) {
                average += val;
            }
        }

        double Valorant = (double) average / (arr.length - 2);

        System.out.println("Цифры: " + Arrays.toString(arr));
        System.out.println("Средняя макс и мин: " + Valorant);
    }
}