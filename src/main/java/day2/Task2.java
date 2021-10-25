package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner((System.in));
        int a = console.nextInt();
        int b = console.nextInt();
        if (a >= b) {
            System.out.println("Некорректный ввод");
        } else {
            for (int firstnumber = a + 1; firstnumber != b; firstnumber++) {
                if (firstnumber % 5 == 0 && firstnumber % 10 != 0) {
                    System.out.print(firstnumber + " ");
                }
            }
        }
    }
}
