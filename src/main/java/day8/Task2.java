package day8;
// Скопируйте класс Самолет из задания дня 6.
//Внесите изменения в класс таким образом,
// чтобы следующий код выводил информацию о самолете, аналогично вызову метода info().
//
//Airplane airplane = new Airplane ("Boeing", 2000, 150, 10000);
//System.out.println(airplane);

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("TU", 2015, 52, 20);
        airplane.info();
        System.out.println();
        System.out.println(airplane);
    }
}
