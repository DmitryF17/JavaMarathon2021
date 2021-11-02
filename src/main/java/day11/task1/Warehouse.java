package day11.task1;

//“Склад” (англ. Warehouse) c полями countPickedOrders (количество собранных заказов),
// countDeliveredOrders (количество доставленных заказов),
// get методами для обоих полей и методом toString() для получения информации о значениях полей склада.
public class Warehouse {
    private  int countPickedOrders = 0;
    private  int countDeliveredOrders = 0;

    public  void setCountPickedOrders(int countPickedOrders) {
       this.countPickedOrders = countPickedOrders;
    }

    public  void setCountDeliveredOrders(int countDeliveredOrders) {
        this.countDeliveredOrders = countDeliveredOrders;
    }

    public  int getCountPickedOrders() {
        return countPickedOrders;
    }

    public  int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public String toString() {
        return "Собранно товаров " + countPickedOrders + " " + "Отправленно товаров " + countDeliveredOrders;
    }
}
