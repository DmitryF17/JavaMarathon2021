package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        for (int time = 0; time != 5; time++) {
            double divisible = console.nextDouble();
            double divider = console.nextDouble();
            if (divider == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(divisible / divider);
        }
    }
}
