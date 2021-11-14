package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.Random;
import java.util.Scanner;

// Реализовать программу, записывающую числа разных типов в 2 файла.
// Файл 1 должен называться “file1.txt”, а Файл 2 должен называться “file2.txt”.
// Оба файла должны находиться в корне проекта. Создаваться файлы должны не вручную,
// а при запуске программы.
//
//
// Файл 1 должен содержать 1000 случайных чисел от 0 до 100.
// Файл 2 создается на основании Файла 1, но содержит числа вещественного типа данных.
// Метод заполнения Файла 2 следующий:
// для каждой группы из 20 целых чисел из Файла 1 рассчитывается их среднее арифметическое.
// Затем, полученное значение записывается в Файл 2.
// Таким образом в Файле 2 будет находиться 50 вещественных чисел (1000 / 20 = 50).
// После того, как Файл 2 будет сформирован,
// необходимо реализовать статический метод printResult(File file).
// Этот метод должен рассчитать сумму всех вещественных чисел из Файла 2 и вывести её в консоль,
// отбросив вещественную часть.
//
// Пример:
// Для простоты, в Файле 1 находится 12 целых чисел,
// а среднее арифметическое рассчитывается для группы из 4 целых чисел.
//
// Файл 1: 3 8 7 5 28 73 4 1 5 32 89 12
// Файл 2: 5.75 26.5 34.5
// Ответ: 66
//
// Комментарии к примеру:
// Среднее арифметическое для четверки 3 8 7 5 равно 5.75
// Таким же образом рассчитаны средние арифметические для остальных четверок из Файла 1.
// Сумма вещественных чисел из Файла 2 равняется 66.75
// Отбросив вещественную часть (числа после запятой) получаем ответ 66.
public class Task2 {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        Random random = new Random();
        try {
            PrintWriter writeFile1 = new PrintWriter(file1);
            PrintWriter writeFile2 = new PrintWriter(file2);
            Scanner scannerFile1 = new Scanner(file1);

            for (int number = 0; number != 1000; number++) {
                writeFile1.print(random.nextInt(101) + " ");
            }
            writeFile1.close();
            String line = scannerFile1.nextLine();
            String[] numbers = line.split(" ");
            double sum = 0;
            for (int step = 0; step != 50; step++) {
                for (int index = step * 20; index != step * 20 + 20; index++) {
                    sum += Double.parseDouble(numbers[index]);
                }
                writeFile2.print(sum + " ");
            }
            writeFile2.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        printResult(file2);
    }

    public static void printResult(File file) {
        double sum = 0;
        try {
            Scanner scannerFile2 = new Scanner(file);
            String line = scannerFile2.nextLine();
            String[] numbers = line.split(" ");
            for (String number: numbers) {
                sum += Double.parseDouble(number);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        System.out.println((int) sum);
    }
}
