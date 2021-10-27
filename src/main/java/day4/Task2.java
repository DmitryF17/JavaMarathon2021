package day4;

import java.util.Random;

// Создать новый массив размера 100
// и заполнить его случайными числами из диапазона от 0 до 10000.
// Затем, используя цикл for each вывести в консоль:
// наибольший элемент массива
// наименьший элемент массива
// количество элементов массива, оканчивающихся на 0
// сумму элементов массива, оканчивающихся на 0
//
//Использовать сортировку запрещено.

public class Task2 {
    public static void main(String[] args) {
        int max = 0;
        int endzero = 0;
        int sumendzero = 0;
        int min = 10000;
        Random random = new Random();
        int[] numbers = new int[100];
        for (int num = 0; num != 100; num++) {
            numbers[num] = random.nextInt(10000);
        }
        for (int num : numbers) {
            if (num <= min) {
                min = num;
            }
            if (num >= max) {
                max = num;
            }
            if (num % 10 == 0) {
                sumendzero += num;
                endzero++;
            }
        }
        System.out.println("Наибольший эемент массива : " + max);
        System.out.println("Наименьший элемент массива : " + min);
        System.out.println("Количество элементов оканчивающихся на ноль : " + endzero);
        System.out.println("Сумма элементов массива , оканчивающихся на ноль : " + sumendzero);
    }
}
