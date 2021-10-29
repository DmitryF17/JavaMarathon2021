package day6;
//В классах Автомобиль и Мотоцикл реализуйте два метода:
//void info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
//int yearDifference(int inputYear) - принимает в качестве аргумента целое число (год)
// и возвращает разницу между переданным годом и годом выпуска транспортного средства
// (возвращаться должно всегда положительное число).
//
//В методе main() класса Task1 создайте экземпляр автомобиля или мотоцикла,
// проверьте работу каждого метода.
public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("GM");
        car.setColor("blue");
        car.setYear(2010);
        car.info();
        System.out.println(car.yearDifference(2009));
    }
}
