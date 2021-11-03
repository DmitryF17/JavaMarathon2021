package day11.task1;

//“Курьер” (англ. Courier) с полями salary (заработная плата)
// и isPayed (был выплачен бонус или нет), get методами для обоих полей,
// методом toString() и конструктором.
public class Courier implements Worker {

    private final Warehouse warehouse;
    private int salary;
    private static final int TASK_SALARY = 100;
    private boolean isPayed;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += TASK_SALARY;
        warehouse.incrementDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        }
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
        } else {
            salary += 50000;
            isPayed = true;
        }
    }

    public String toString() {
        return String.valueOf(salary);
    }
}
