package day6;

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

    void info() {
        System.out.println("Это автомобиль");
    }

    int yearDifference(int inputYear) {
        return (year <= inputYear) ? inputYear - year : year - inputYear;
    }
}
