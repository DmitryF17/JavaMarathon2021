package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner((System.in));
        int a = console.nextInt() + 1;
        int b = console.nextInt();
        if (a >= b) {
            System.out.println("Некорректный ввод");
        } else {
            while (a != b) {
                if (a % 5 == 0 && a % 10 != 0) {
                    System.out.print(a + " ");
                }
                a++;
            }
        }
    }
}