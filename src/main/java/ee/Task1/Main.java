package ee.Task1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int Answers = 0;

        for (int i = 0; i < 5; i++) {
            int num1 = random.nextInt(10) + 1;
            int num2 = random.nextInt(10) + 1;
            int correctAnswer = num1 * num2;

            System.out.print(num1 + " * " + num2 + "? : ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("\u001B[32mПравильно!\u001B[0m");
                Answers++;
            } else {
                System.out.println("\u001B[31mНеправильно!\u001B[0m");
            }
        }

        switch (Answers) {
            case 5:
                System.out.println("Молодец!");
                break;
            case 3:
            case 4:
                System.out.println("Надо бы еще поучить...");
                break;
            default:
                System.out.println("Срочно нужно учить таблицу умножения!");
                break;
        }
    }
}
