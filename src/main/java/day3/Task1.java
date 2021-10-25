package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String town = console.next();
        switch (town) {
            case "Москва":
            case "Владивосток":
            case "Ростов":
                System.out.println("Россия");
                break;
            case "Рим":
            case "Милан":
            case "Турин":
                System.out.println("Италия");
                break;
            case "Ливерпуль":
            case "Манчестер":
            case "Лондон":
                System.out.println("Англия");
                break;
            case "Берлин":
            case "Мюнхен":
            case "Кельн":
                System.out.println("Германия");
                break;
            case "Stop":
                System.out.println("программа завершила работу");
                break;
            default:
                System.out.println("Неизвестная страна");
        }
    }
}
