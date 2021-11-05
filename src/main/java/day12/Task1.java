package day12;
//Создать список строк, добавить в него 5 марок автомобилей, вывести список в консоль.
// Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль из списка.
// Вывести список в консоль.

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("FORD");
        cars.add("GM");
        cars.add("AUDI");
        cars.add("VOLVO");

        for (String car : cars) {
            System.out.println(car);
        }

        cars.add(2, "FIAT");
        cars.remove(0);

        for (String car : cars) {
            System.out.println(car);
        }
    }
}
