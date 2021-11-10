package day14;
//Реализовать статический метод List<Person> parseFileToObjList(File file),
// который считывает содержимое того же файла people.txt,
// создает экземпляры класса “Человек” и возвращает список объектов.
// Получить данный список в методе main() и распечатать его в консоль.
// В случае, если файла не существует в папке проекта,
// в программе необходимо выбрасывать исключение и выводить в консоль сообщение “Файл не найден”.
// Помимо этого, если значение возраста отрицательно,
// необходимо выбрасывать исключение и выводить в консоль сообщение “Некорректный входной файл”.
//Пример ответа: [{name='Mike', year=24}, {name='John', year=19}, {name='Miguel', year=5}]
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        System.out.println(parseFileToObjList(file));
    }
    public static List<Human> parseFileToObjList(File file) {
        List<Human> peoples = new ArrayList<>();
        String[] human;
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String people = scanner.nextLine();
                if (people.contains("-")) {
                    try {
                        throw new Exception();
                    } catch (Exception t) {
                        System.out.println("Некорректный входной файл");
                    }
                }
                human = people.split(" ");
                peoples.add(new Human(human[0], Integer.parseInt(human[1])));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return peoples;
    }
}
