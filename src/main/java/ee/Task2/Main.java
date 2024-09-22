package ee.Task2;

import java.util.Scanner;

public class Main {
    private static final String[] ANIMALS = {"крысы", "коровы", "тигра", "зайца", "дракона", "змеи", "лошади", "овцы", "обезьяны", "курицы", "собаки", "свиньи"};
    private static final String[] COLORS = {"желтый","чёрный","зеленый","белый","красный"};
    public static String getYear(int year) {
        int year1 = (year - 1984) % 60;
        int colorIndex = (year1 / 12) % 5;
        int animalIndex = year1 % 12;

        String color = COLORS[colorIndex];
        String animal = ANIMALS[animalIndex];

        return "Год " + color + " " + animal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        System.out.println(getYear(year));
    }
}
