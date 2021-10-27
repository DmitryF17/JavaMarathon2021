package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// С клавиатуры вводится число n - размер массива.
// Необходимо создать массив указанного размера
// и заполнить его случайными числами от 0 до 10 (не включительно).
// Используя цикл for each вывести содержимое массива в консоль,
// а также вывести в консоль информацию о:
//а) Длине массива
//б) Количестве чисел больше 8
//в) Количестве чисел равных 1
//г) Количестве четных чисел
//д) Количестве нечетных чисел
//е) Сумме всех элементов массива
public class Task1 {
    public static void main(String[] args) {
        int counter8 = 0;
        int counter1 = 0;
        int countereven = 0;
        int counterodd = 0;
        int sum = 0;
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        Random random = new Random();
        int[] numbers = new int[n];
        for (int number = 0; number != n; number++) {
            numbers[number] = random.nextInt(10);
        }
        for (int num : numbers) {
            sum += num;
            if (num > 8) {
                counter8++;
            }
            if (num == 1) {
                counter1++;
            }
            if (num % 2 == 0 & num != 0) {
                countereven++;
            }
            if (num % 2 != 0) {
                counterodd++;
            }
        }
        System.out.println("Введено число " + n + " Сгенерирован массив :");
        System.out.println(Arrays.toString(numbers));
        System.out.println("Длина массива : " + n);
        System.out.println("Количество чисел больше 8 : " + counter8);
        System.out.println("Количество чисел равных 1 : " + counter1);
        System.out.println("Количество четных чисел : " + countereven);
        System.out.println("Количество нечетных чисел : " + counterodd);
        System.out.println("Сумма всех элементов массива : " + sum);
    }
}
