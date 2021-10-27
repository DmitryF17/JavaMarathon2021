package day4;

import java.util.Random;

//Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
//Найти максимум среди сумм трех соседних элементов.
// Для найденной тройки с максимальной суммой выведите значение суммы и индекс первого элемента тройки.
public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int maxsumtree = 0;
        int indexmaxsumfirst = 0;
        int[] matrix = new int[100];
        for (int index = 0; index != 100; index++) {
            matrix[index] = random.nextInt(10000);
        }
        for (int index = 0; index != 98; index++) {
           int sumtree = matrix[index] + matrix[index + 1] + matrix[index + 2];
            if (sumtree > maxsumtree) {
                maxsumtree = sumtree;
                indexmaxsumfirst = index;
            }
        }
        System.out.println(maxsumtree);
        System.out.println(indexmaxsumfirst);
    }
}
