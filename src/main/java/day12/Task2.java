package day12;
//Создать новый список, заполнить его четными числами от 0 до 30 и от 300 до 350.
// Вывести список.

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int number = 0; number != 30; number += 2) {
            evenNumbers.add(number);
        }
        for (int number = 300; number != 350; number += 2) {
            evenNumbers.add(number);
        }
        for (Integer number : evenNumbers) {
            System.out.print(number + " ");
        }
    }
}
