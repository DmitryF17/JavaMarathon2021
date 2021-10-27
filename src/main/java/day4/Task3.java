package day4;

import java.util.Random;

//Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
// Размер матрицы задать m=12, n=8 (m - размерность по строкам,
// n - размерность по колонкам).
// В консоль вывести индекс строки, сумма чисел в которой максимальна.
// Если таких строк несколько, вывести индекс последней из них.
public class Task3 {
    public static void main(String[] args) {
        int maxline = 0;
        int indexline = 0;
        Random random = new Random();
        int[][] matrix = new int[12][8];
        for (int line = 0; line != matrix.length; line++) {
            for (int i = 0; i != matrix[line].length; i++) {
                matrix[line][i] = random.nextInt(50);
            }
        }
        for (int i = 0; i !=  matrix.length; i++) {
            int sumcolumn = 0;
            for (int j = 0; j != matrix[i].length; j++) {
                sumcolumn += matrix[i][j];
            }
            if (sumcolumn >= maxline) {
                maxline = sumcolumn;
                indexline = i;
            }
        }
        System.out.println("Индекс строки , сумма чисел в которой максимальна : " + indexline);
    }
}
