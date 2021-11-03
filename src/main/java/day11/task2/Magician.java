package day11.task2;

public class Magician extends Hero implements MagicAttack {

    int magicAtt = 20;

    public Magician() {
        magicDef = 0.8;
        physAtt = 5;
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
        return "Magician{" +
                "health=" + health +
                '}';
    }
}


