package day11.task1;

//“Курьер” (англ. Courier) с полями salary (заработная плата)
// и isPayed (был выплачен бонус или нет), get методами для обоих полей,
// методом toString() и конструктором.
public class Courier implements Worker {
    private final Warehouse warehouse;
    private int salary;
    private boolean isPayed;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setPayed(boolean payed) {
        isPayed = payed;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public String toString() {
        return String.valueOf(salary);
    }

    @Override
    public void doWork() {
        setSalary(getSalary() + 100);
        warehouse.setCountDeliveredOrders(warehouse.getCountDeliveredOrders() + 1);
        if (warehouse.getCountDeliveredOrders() == 10000) {
            bonus();
        }
    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        } else if (warehouse.getCountDeliveredOrders() > 10000 & isPayed) {
            System.out.println("Бонус уже был выплачен");
        } else {
            setSalary(getSalary() + 50000);
            isPayed = true;
        }
    }
}
