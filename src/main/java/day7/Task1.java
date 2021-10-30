package day7;

//В классе Самолет реализовать статический метод compareAirplanes,
// который в качестве аргументов принимает два объекта класса Airplane (два самолета)
// и выводит сообщение в консоль о том, какой из самолетов длиннее.

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("IL", 1999, 53, 20);
        Airplane airplane2 = new Airplane("IL", 2000, 54, 20);
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}