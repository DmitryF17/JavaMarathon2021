package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while (true) {
            double divisible = console.nextDouble();
            double divider = console.nextDouble();
            if (divider == 0) {
                break;
            }
            System.out.println(divisible / divider);
        }
    }
}
