package day11.task1;

//Реализуйте в классе Task1 статический метод:
//static void businessProcess(Worker worker)
//
//Этот метод в качестве аргумента принимает объект класса,
// реализующего интерфейс Worker. В теле этого метода на объекте worker должен 10.000 раз вызываться метод doWork(),
// и после этого должен быть один раз вызван метод bonus().
//
//Для демонстрации и тестирования работы программы, в методе main() создайте склад и по 1 рабочему.
// Свяжите этих двух рабочих со складом. После этого, вызовите метод businessProcess(Worker worker),
// передавая в качестве аргумента сотрудника. Вызовите метод сначала для сборщика, а потом для курьера.
// Выведите в консоль количество собранных и доставленных заказов на складе и ЗП каждого из сотрудников.
//Создайте второй склад, на который также “примите” по 1 новому сотруднику. Вызовите один раз метод doWork() у
// сотрудников второго склада. Проконтролируйте, что у склада 1 и его сотрудников при этом значения не меняются.
public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Worker picker1 = new Picker(warehouse1);
        Worker courier1 = new Courier(warehouse1);
        businessProcess(picker1);
        businessProcess(courier1);
        System.out.println(warehouse1.toString());
        System.out.println("ЗП сборщика " + picker1.toString());
        System.out.println("ЗП курьера " + courier1.toString());
        Warehouse warehouse2 = new Warehouse();
        Worker picker2 = new Picker(warehouse2);
        Worker courier2 = new Courier(warehouse2);
        picker2.doWork();
        courier2.doWork();
        System.out.println(warehouse1.toString());
        System.out.println("ЗП сборщика " + picker1.toString());
        System.out.println("ЗП курьера " + courier1.toString());
    }

    static void businessProcess(Worker worker) {
        for (int step = 0; step != 10000; step++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
