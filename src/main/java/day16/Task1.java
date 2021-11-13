package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Реализовать программу, которая на вход принимает txt файл с целыми числами
// (можно использовать файл из задания 1 дня 14)
// и в качестве ответа выводит в консоль среднее арифметическое этих чисел.
//Ответ будет являться вещественным числом.
// В консоль необходимо вывести полную запись вещественного числа
// (со всеми знаками после запятой) и сокращенную запись (с 3 знаками после запятой).
//
//Детали реализации: В классе Task1 создать публичный статический метод printResult(File file),
// в котором реализовать вышеописанную логику.
// В методе main() класса Task1 вызвать метод printResult(File file),
// передав ему в качестве аргумента объект класса File (txt файл с целыми числами).
//
//Пример:
//Числа в txt файле: 5 2 8 34 1 36 77
//Ответ: 23.285714285714285 --> 23.286
public class  Task1 {
    public static void main(String[] args) {
        File file = new File("number.txt");
        printResult(file);
    }

    public static void printResult(File file) {
        double sum = 0;
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            for (String number : numbers) {
                sum += Integer.parseInt(number);
            }
            double average = sum / numbers.length;
            System.out.printf(average + " --> %.3f", average);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}


