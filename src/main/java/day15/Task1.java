package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

// Вам дан файл с информацией об остатках обуви на складе (src/main/resources/shoes.csv).
// Это пример реальной выгрузки остатков из 1С в csv файл (формат файла с разделителями,
// в качестве разделителя использован символ “;”).
// В этом файле содержится информация о названии модели обуви,
// ее размер и оставшееся на складе количество.
//
// До преобразования в csv это была таблица с тремя колонками:
// Необходимо сформировать новый файл (src/main/resources/missing_shoes.txt)
// с информацией о моделях и размерах обуви, которой нет на складе (количество = 0).
// Для этого реализуйте программу, которая принимает на вход csv файл и создает новый txt файл
// следующего содержания (должно получиться 11 строк):
// Возникающие исключения обрабатывать (try-catch), а не пробрасывать в сигнатуре метода (throws).
// Учтите ситуацию, когда в файле может быть содержимое отличное от ожидаемого.
// В нашем случае файл один и он корректен,
// но гипотетически может быть подан пустой файл или кол-во столбцов отличаться от трех.
public class Task1 {
    public static void main(String[] args) {
        File filein = new File("src/main/resources/shoes.csv");
        File fileiout = new File("src/main/resources/missing_shoes.txt");
        readAndWriteFile(filein, fileiout);
    }

    private static void readAndWriteFile(File filein, File fileout) {
        try {
            Scanner scanner = new Scanner(filein);
            PrintWriter pw = new PrintWriter(fileout);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] numbers = line.split(";");
                if (numbers.length != 3) {
                    throw new IllegalArgumentException();
                }
                if (Integer.parseInt(numbers[2]) == 0) {
                    pw.println(line);
                }
            }
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}
