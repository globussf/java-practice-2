package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class task1 {
    static void main() {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(4, 3, 7, 3, 9));
        Scanner scanner = new Scanner(System.in);

        System.out.println("Список чисел: "+numbers);
        System.out.println("Выберете действие: \n1-добавить элемент \n2-удалить элемент");
        int userChoose = scanner.nextInt();

        switch (userChoose) {
            case 1:
                System.out.println("Введите целое число для добавления в список");
                try {
                    int userNumber = scanner.nextInt();
                    numbers.add(userNumber);
                    break;
                } catch (InputMismatchException ex) {
                    System.out.println("Ошибка: нужно ввести целое число");
                    System.exit(1);
                }

            case 2:
                System.out.println("Укажите индекс элемента который хотите удалить(от 0 до " + (numbers.size() - 1) + "):");
                try {
                    int userIndex = scanner.nextInt();
                    if (userIndex < 0 || userIndex > numbers.size() - 1) {
                        System.out.println("Ошибка: индекс выходит за границы массива");
                        System.exit(1);
                    }
                    numbers.remove(userIndex);
                    break;
                } catch (InputMismatchException ex) {
                    System.out.println("Ошибка: нужно ввести целое число");
                    System.exit(1);
                }

            default:
                System.out.println("Неверный выбор. Введите 1 или 2");
                System.exit(1);
        }
        System.out.println(numbers);
    }
}
