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
        int index = 0;
        int sumcolumn = 0;
        Random random = new Random();
        int[][] matrix = new int[12][8];
        for (int line = 0; line != 12; line++) {
            for (int column = 0; column != 8; column++) {
                matrix[line][column] = random.nextInt(50);
            }
        }
        for (int[] matrixcolumn : matrix) {
            for (int num : matrixcolumn) {
                sumcolumn += num;
            }
            if (sumcolumn >= maxline) {
                maxline = sumcolumn;
                indexline = index;
            }
            index++;
        }
        System.out.println("Индекс строки , сумма чисел в которой максимальна : " + indexline);
    }
}
