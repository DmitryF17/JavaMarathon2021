package day11.task2;

public class Palladin extends Hero implements PhysAttack, Healer {
    static final int HEALTH_AMOUNT = 25;
    static final int HEALTH_TEAMMATE = 10;

    public Palladin() {
        physDef = 0.5;
        magicDef = 0.2;
        physAtt = 15;
    }


    @Override
    public void healHimself() {
        if (health + HEALTH_AMOUNT > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else {
            health += HEALTH_AMOUNT;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + HEALTH_TEAMMATE > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else {
            hero.health += HEALTH_TEAMMATE;
        }
    }

    @Override
    public String toString() {
        return "Palladin{" +
                "health=" + health +
                '}';
    }
}
