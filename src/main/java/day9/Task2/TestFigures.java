package day9.Task2;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import org.w3c.dom.ls.LSOutput;

//В этом же классе реализуйте два метода:
//public static double calculateRedPerimeter(Figure[] figures)
//public static double calculateRedArea(Figure[] figures)
//
//Первый метод, принимая на вход массив геометрических фигур,
// должен вернуть сумму периметров красных фигур.
// Второй метод, принимая на вход массив геометрических фигур,
// должен вернуть сумму площадей красных фигур.
//Вызовите эти два метода на массиве figures и выведите результат в консоль.
public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle("Red", 10, 10, 10),
                new Triangle("Green", 10, 20, 30),
                new Triangle("Red", 10, 20, 15),
                new Rectangle("Red", 5, 10),
                new Rectangle("Orange", 40, 15),
                new Circle("Red", 4),
                new Circle("Red", 10),
                new Circle("Blue", 5)
        };
        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double sumRedFigeresPerimetr = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) {
                sumRedFigeresPerimetr += figure.perimeter();
            }
        }
        return sumRedFigeresPerimetr;
    }

    public static double calculateRedArea(Figure[] figures) {
        double sumRedFiguresArea = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) {
                sumRedFiguresArea += figure.area();
            }
        }
        return sumRedFiguresArea;
    }
}
