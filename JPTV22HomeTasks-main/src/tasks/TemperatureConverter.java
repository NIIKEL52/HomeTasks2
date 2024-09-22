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
public class TemperatureConverter {

    private final Scanner scanner;

    public TemperatureConverter(Scanner scanner) {
        this.scanner = scanner;
    }

    public void doConvert() {
        boolean repeat = true;
        do{
            System.out.println("Выберете направление конвертирования:");
            System.out.println("0. Выход из прогораммы");
            System.out.println("1. Фаренгейт - Цельсия");
            System.out.println("Номер направления: ");
            int task = this.scanner.nextInt();scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("Выбран выход из программы");
                    repeat = false;
                    break;
                case 1:
                    System.out.println("Выбрана задача 1");
                   
                    break;
                case 2:
                    System.out.println("Выбрана задача 2");
                   
                    break;
                default:
                    System.out.println("Выбирайте задачу");
                    break;
            }  
        }while(repeat);
        System.out.println();
    }
}

