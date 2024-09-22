package ee.Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] temperatureData = {
                new int[31], // January
                new int[28], // February
                new int[31], // March
                new int[30], // April
                new int[31], // May
                new int[30], // June
                new int[31], // July
                new int[31], // August
                new int[30], // September
                new int[31], // October
                new int[30], // November
                new int[31]  // December
        };

        // Заполнение данных температур
        fillTemperatureData(temperatureData);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите месяц (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Введите день (1-" + temperatureData[month - 1].length + "): ");
        int day = scanner.nextInt();

        System.out.println("Температура " + month + "/" + day + ": " + temperatureData[month - 1][day - 1]);

        // Поиск самого горячего и холодного дня
        int[] hottestAndColdest = findHottestAndColdestDay(temperatureData);
        System.out.println("Самый жаркий день: " + hottestAndColdest[0]);
        System.out.println("Самый холодный день: " + hottestAndColdest[1]);

        // Средняя температура по месяцам
        printAverageTemperatures(temperatureData);
    }

    private static void fillTemperatureData(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i < 3 || i > 9) { // Winter
                    data[i][j] = (int) (Math.random() * 10) - 5;
                } else if (i >= 3 && i <= 5) { // Spring
                    data[i][j] = (int) (Math.random() * 15) + 5;
                } else { // Summer
                    data[i][j] = (int) (Math.random() * 20) + 10;
                }
            }
        }
    }

    private static int[] findHottestAndColdestDay(int[][] data) {
        int hottestTemp = Integer.MIN_VALUE;
        int coldestTemp = Integer.MAX_VALUE;
        int hottestDay = 0;
        int coldestDay = 0;
        int dayCounter = 1;

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++, dayCounter++) {
                if (data[i][j] > hottestTemp) {
                    hottestTemp = data[i][j];
                    hottestDay = dayCounter;
                }
                if (data[i][j] < coldestTemp) {
                    coldestTemp = data[i][j];
                    coldestDay = dayCounter;
                }
            }
        }
        return new int[]{hottestDay, coldestDay};
    }

    private static void printAverageTemperatures(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            int sum = 0;
            for (int j = 0; j < data[i].length; j++) {
                sum += data[i][j];
            }
            double avgTemp = (double) sum / data[i].length;
            System.out.println("Средняя температура за месяц " + (i + 1) + ": " + avgTemp);
        }
    }
}
