package day19.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author fardmin
 * В папке resources находится файл taxi_cars.txt.
 * Этот файл содержит в себе данные о местоположении
 * 500 машин такси (каждая машина такси находится на новой строке).
 * Формат данных в файле следующий:
 * id_машины координата_по_x координата_по_y
 * Вам необходимо считать строки из файла taxi_cars.txt в HashMap<Integer, Point>.
 * Для квадрата, введенного пользователем, вам необходимо,
 * используя сформированный объект HashMap<Integer, Point>,
 * определить, какие машины попали внутрь этого квадрата.
 * Вам необходимо вывести в консоль идентификаторы машин,
 * которые находятся внутри квадрата и общее количество машин в квадрате.
 * Машины, лежащие на грани квадрата, не учитываются.
 * Алгоритм должен работать для любого корректно введенного квадрата.
 */
public class Task3 {
    public static void main(String[] args) {
        Map<Integer, Point> cars = new HashMap<>();
        List<Integer> carsSqure = new ArrayList<>();

        try {
            File file = new File("src/main/resources/taxi_cars.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String car = scanner.nextLine();
                String[] carPoint = car.split(" ");
                if (carPoint.length != 3) {
                    throw new IllegalArgumentException();
                }
                cars.put(Integer.parseInt(carPoint[0]),
                        new Point(Integer.parseInt(carPoint[1]),
                                Integer.parseInt(carPoint[2])));
            }

            Scanner scan = new Scanner(System.in);
            System.out.println("Введите координаты квадрата");
            String square = scan.nextLine();
            String[] points = square.split(" ");
            if (points.length != 4) {
                throw new IllegalArgumentException();
            }
            for (Integer point : cars.keySet()) {
                if (cars.get(point).getX() > Integer.parseInt(points[0]) &
                        cars.get(point).getX() < Integer.parseInt(points[2]) &
                        cars.get(point).getY() < Integer.parseInt(points[1]) &
                        cars.get(point).getY() > Integer.parseInt(points[3])
                ) {
                    carsSqure.add(point);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный ввод данных");
        }

        System.out.println("Идентификаторы машин в квадрате " + carsSqure);
        System.out.println("Количество машин в квадрате " + carsSqure.size());
    }
}

