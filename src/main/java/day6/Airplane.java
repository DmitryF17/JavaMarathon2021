package day6;

public class Airplane {
    private String producer;
    private int year;
    private  double length;
    private int weight;
    private  int fuel;

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public Airplane(String producer, int year, double length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    void info() {
        System.out.print("Изготовитель : " + producer + ", год выпуска : " + year
                + ", длина : " + length + ", вес : " + weight
                + ", количество топлива в баке : " + fuel);
        }
    public void fillUp(int n) {
        setFuel(n + getFuel());
    }
}

