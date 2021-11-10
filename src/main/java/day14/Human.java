package day14;
//Создать класс “Человек” с полями “имя” и “возраст”.
public class Human {
    String name;
    int age;
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return '{' + "name='" + name + '\'' +
                ", year=" + age +
                '}';
    }
}
