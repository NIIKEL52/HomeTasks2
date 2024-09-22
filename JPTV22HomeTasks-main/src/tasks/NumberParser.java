/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class NumberParser {
   
    private final Scanner scanner;


    public NumberParser(Scanner scanner) {
        this.scanner = scanner;
    }

    public void doParser() {
        boolean repeat = true;
            System.out.println();
            System.out.println("-------------");
            System.out.println("Парсер числа");
            System.out.println("--------------");
            System.out.println("Введите трех значное число:");
            int number = scanner.nextInt();scanner.nextLine();
           
            int edCount = 0;
            int deCount = 0;
            int sumNumber = 0;
            System.out.println("В веденном числе: %n");
            System.out.println(" - единиц:%d%n");
            System.out.println(" - десятков:%d%n");
            System.out.println("Сумма цифр:");
            System.out.println();
           
    }
}
