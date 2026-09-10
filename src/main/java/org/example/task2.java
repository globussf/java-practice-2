package org.example;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class task2 {
    static void main() {
        System.out.println("Угадай число");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randNum = random.nextInt(1,101);
        int count = 0;

        while (count < 10){
            System.out.println("Введите число от 1 до 100:");
            int userNum = scanner.nextInt();
            if (userNum < 1 || userNum > 100){
                System.out.println("Ошибка: число должно быть в диапазоне от 1 до 100");
                continue;
            }else if(userNum < randNum){
                System.out.println("Моё число больше");
                count++;
                continue;
            } else if (userNum > randNum) {
                System.out.println("Моё число меньше");
                count++;
                continue;
            } else {
                System.out.println("Поздравляю! Вы угадали!");
                count++;
                System.out.println("Вы угадали за "+count+" попыток");
                System.exit(0);
            }
            break;
        }
        System.out.println("Вы исчерпали все попытки. Загаданное число было "+randNum);
    }
}
