package org.example.units;
import java.util.ArrayList;

public abstract class Wizard extends BaseHero implements GameInterface{
    protected int mana;
    protected int maxMana;

    public Wizard(float hp, int maxHp, int attack, int damageMin,
                  int damageMax, int defense, int speed,int mana,int maxMana, int posX, int posY) {
        super(hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);

        this.mana=mana;
        this.maxMana = maxMana;
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        for (BaseHero human: team1) {
            if (human.hp < human.maxHp & !human.state.equals("Die")) {
                human.getDamage(damageMax);
                return;
            }
        }
    }


}
