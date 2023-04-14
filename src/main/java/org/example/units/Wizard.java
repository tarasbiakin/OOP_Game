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
    @Override
    public String toString() {
        return name +
                " \uD83D\uDC97: " + Math.round(hp) +
                " \uD83D\uDEE1️: " + defense +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((damageMin+damageMax)/2)) +
                "\uD83D\uDD31 " + mana + " " +
                "\uD83D\uDCAA"+speed+" "+
                state;
    }


}
