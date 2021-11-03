package day11.task2;

public class Shaman extends Hero implements MagicAttack, PhysAttack, Healer {

    int magicAtt = 15;
    static final int HEALTH_AMOUNT = 50;
    static final int HEALTH_TEAMMATE = 30;

    public Shaman() {
        health = 100;
        physDef = 0.2;
        magicDef = 0.2;
        physAtt = 10;
    }

    @Override
    public void setHealth(int health) {
        if (health < 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
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
    public void magicalAttack(Hero hero) {
        double attackscore = magicAtt * (1 - hero.magicDef);
        if (hero.health - attackscore < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attackscore;
        }
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
