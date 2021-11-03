package day11.task1;
//“Сборщик” (англ. Picker) с полями salary (заработная плата) и isPayed (был выплачен бонус или нет),
// get методами для обоих полей, методом toString() и конструктором.

public class Picker implements Worker {

    private final Warehouse warehouse;
    private int salary;
    private static final int TASK_SALARY = 80;
    private boolean isPayed = false;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += TASK_SALARY;
        warehouse.incrementPickedOrders();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
            return;
        }
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary += 70000;
        isPayed = true;
    }

    public String toString() {
        return String.valueOf(salary);
    }
}
