package day8;

//Создать строку, состоящую из чисел от 0 до 20000.
// Важно понимать, что это одна строка, полученная конкатенацией (“склеиванием”)
// чисел из диапазона через пробел (0 + “ “ + 1 + “ “ + 2 + … + 20000).
//После создания такой строки, вызов System.out.println() на этой строке должен вывести в консоль сразу все числа из диапазона:
//0 1 2 3 4 5 6 7 8 9 10 11 12 … 19995 19996 19997 19998 19999 20000
//
//Для того, чтобы почувствовать разницу в производительности между конкатенацией обычных строк (класс String)
// и использовании StringBuilder, реализуйте описанную задачу этими двумя способами, замеряя время работы программы.
public class Task1 {
    public static void main(String[] args) {
        long startTime1 = System.currentTimeMillis();
        String numbers = "";
        for (int number = 0; number != 20001; number++) {
            numbers += number + " ";
        }
        long stopTime1 = System.currentTimeMillis();
        long startTime2 = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("");
        for (int number = 0; number != 20001; number++) {
            builder.append(number).append(" ");
        }
        long stopTime2 = System.currentTimeMillis();
        System.out.println(numbers);
        System.out.println("Длительность работы, в мс. String : " + (stopTime1 - startTime1));
        System.out.println(builder);
        System.out.println("Длительность работы, в мс. StringBuilder : " + (stopTime2 - startTime2));
    }
}
