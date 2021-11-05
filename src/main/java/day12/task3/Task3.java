package day12.task3;

import day11.task2.MagicAttack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year (название музыкальной группы и год основания).
// Создать 10 или более экземпляров класса MusicBand , добавить их в список (выбирайте такие музыкальные группы,
// которые были созданы как до 2000 года, так и после, жанр не важен).
// Перемешать список. Создать статический метод в классе Task3:
//public static List<MusicBand> groupsAfter2000(List<MusicBand> bands)
//Этот метод принимает список групп в качестве аргумента и возвращает новый список,
// состоящий из групп, основанных после 2000 года. Вызвать метод groupsAfter2000(List<MusicBand> bands) в методе main()
// на вашем списке из 10 групп. Вывести в консоль оба списка (оригинальный и с группами, основанными после 2000 года).
public class Task3 {

    public static void main(String[] args) {
        List<MusicBand> musicbands = new ArrayList<>();

        musicbands.add(new MusicBand("Rolling Stones", 1962));
        musicbands.add(new MusicBand("КИНО", 1982));
        musicbands.add(new MusicBand("ДДТ", 1980));
        musicbands.add(new MusicBand("No Name", 2002));
        musicbands.add(new MusicBand("Name", 2010));

        Collections.shuffle(musicbands);
        System.out.println(musicbands);
        System.out.println(groupsAfter2000(musicbands));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> groupsAfter = new ArrayList<>();
        for (MusicBand musicBand : bands) {
            if (musicBand.year > 2000) {
                groupsAfter.add(musicBand);
            }
        }
        return groupsAfter;
    }
}




