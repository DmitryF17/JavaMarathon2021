package day5;
//Создать класс Автомобиль (англ. Car) с полями “Модель”, “Цвет”, “Год выпуска”.
// Создать get и set методы для каждого поля.
// Создать экземпляр класса Автомобиль.
// Задать значение для каждого поля, используя set методы.
// Вывести в консоль значение каждого из полей, используя get методы.
//Созданный вами класс должен отвечать принципам инкапсуляции.

public class Car {
    private String model;
    private String color;
    private int year;

    public void setModel(String setmodel) {
        model = setmodel;
    }

    public void setColor(String setcolor) {
        color = setcolor;
    }

    public void setYear(int setyear) {
        year = setyear;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}
