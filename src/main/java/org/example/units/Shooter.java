package org.example.units;

import java.util.ArrayList;

public abstract class Shooter extends Warrior {
    protected int range;
    protected int ammo;

    protected Shooter(float hp, int maxHp, int attack, int damageMin,
                      int damageMax, int defense, int speed, int ammo,
                      int range, int posX, int posY) {
        super(hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
        this.range = range;
        this.ammo = ammo;
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        if (state.equals("Die") || ammo == 0) return;
        BaseHero victim = team2.get(findNearest(team2));
        float damage = (victim.defense - attack)>0 ? damageMin : (victim.defense - attack)<0 ? damageMax : (damageMin+damageMax)/2;
        victim.getDamage((int) damage);
        for (BaseHero human: team1) {
            if (human.getInfo().toString().split(":")[0].equals("Фермер") && human.state.equals("Stand")) {
                human.state = "Busy";
                return;
            }
        }
        ammo--;
    }

    @Override
    public String toString() {
        return name +
                " \uD83D\uDC97: " + Math.round(hp) +
                " \uD83D\uDEE1️: " + defense +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((damageMin+damageMax)/2)) +
                " Shots:" + ammo + " " +
                "\uD83D\uDCAA"+speed+" "+
                state;
    }

}
