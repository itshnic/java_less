package org.example.lessTwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов в последовательности: ");
        int quantity = scanner.nextInt();
        System.out.println("Сумма элементов: ");
        System.out.println(getSumm(scanner, quantity));
    }

    /**
     * @param scanner
     * @param quantity
     * @return
     * @apiNote Метод подсчета суммы чисел
     */
    private static int getSumm(Scanner scanner, int quantity) {
        int summ = 0;
        int current = scanner.nextInt();
        for (int i = 0; i < quantity; i++) {
            int next = scanner.nextInt();
            if (next % 5 == 0 && current % 2 == 0)
                summ += next;
            current = next;
        }
        return summ;
    }
}