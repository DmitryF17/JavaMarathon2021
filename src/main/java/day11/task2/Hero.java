package day11.task2;

//Каждый класс-герой должен иметь:
//Поля
//health (здоровье)
//physDef (процент поглощения физического урона)
//magicDef (процент поглощения магического урона)
//physAtt (величина физической атаки), по необходимости
//magicAtt (величина магической атаки), по необходимости
//Реализацию необходимых интерфейсов
//Переопределенный toString()
//Каждый герой должен обладать только теми способностями,
// которые ему доступны. Например, Воин не может лечить, значит в классе Воин не реализуется интерфейс Healer,
// соответственно запись warrior.healHimself() является недопустимой.
// Параметры для героя задаются внутри конструктора, при этом сам конструктор не должен принимать аргументов.
public abstract class Hero implements PhysAttack, MagicAttack, Healer {
    final int MIN_HEALTH = 0;
    static final int MAX_HEALTH = 100;
    int health;
    double physDef;
    double magicDef;
    int physAtt;

    public Hero() {
        health = 100;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public void healTeammate(Hero hero) {
    }

    @Override
    public void healHimself() {
    }

    @Override
    public void physicalAttack(Hero hero) {
        double attackscore = physAtt * (1 - hero.physDef);
        if (hero.health - attackscore < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attackscore;
        }
    }

    @Override
    public void magicalAttack(Hero hero) {
    }

    @Override
    public String toString() {
        return String.valueOf(health);
    }
}
