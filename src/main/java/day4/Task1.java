package day4;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int z = 0;
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int[] numbers = new int[n];
        for (int number = 0; number != n; number++) {
            numbers[number] = (int) (Math.random() * (10 - 1)) + 1;
        }

        System.out.println("Введено число " + n + " Сгенерирован массив :");
        System.out.print("[");
        for (int num : numbers) {
            if (num > 8) {
                x++;
            }
            if (num == 1) {
                y++;
            }
            if (num % 2 == 0) {
                z++;
            }
            System.out.print(num + " ");
        }
        System.out.print("]");
        System.out.println();
        System.out.println("Длина массива : " + n);
        System.out.println("Количество чисел больше 8 : " + x);
        System.out.println("Количество чисел равных 1 : " + y);
        System.out.println("Количество четных чисел : " + z);
    }
}
