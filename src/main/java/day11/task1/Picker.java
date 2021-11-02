package day11.task1;
//“Сборщик” (англ. Picker) с полями salary (заработная плата) и isPayed (был выплачен бонус или нет),
// get методами для обоих полей, методом toString() и конструктором.

public class Picker implements Worker {
    private final Warehouse warehouse;
    private int salary = 0;
    private boolean isPayed = false;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    private void setSalary(int salary) {
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
        setSalary(getSalary() + 80);
        warehouse.setCountPickedOrders(warehouse.getCountPickedOrders() + 1);
        if (warehouse.getCountPickedOrders() == 10000 & !isPayed) {
            bonus();
        }
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        } else if (warehouse.getCountPickedOrders() > 10000 & isPayed) {
            System.out.println("Бонус уже был выплачен");
        } else {
            setSalary(getSalary() + 70000);
            isPayed = true;
        }
    }
}
