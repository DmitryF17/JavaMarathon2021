package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        var warrior = new Warrior();
        var palladin = new Palladin();
        var shaman = new Shaman();
        var magician = new Magician();

        warrior.physicalAttack(palladin);
        System.out.println(palladin.toString());
        palladin.physicalAttack(magician);
        System.out.println(magician.toString());
        shaman.healTeammate(magician);
        System.out.println(magician.toString());
        magician.magicalAttack(palladin);
        System.out.println(palladin.toString());
        shaman.physicalAttack(warrior);
        System.out.println(warrior.toString());
        palladin.healHimself();
        System.out.println(palladin.toString());
        System.out.println();
        for (int i = 0; i < 5; i++) {
            warrior.physicalAttack(magician);
            System.out.println(magician.toString());
        }
    }
}
