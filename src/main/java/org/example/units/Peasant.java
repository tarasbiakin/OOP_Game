package org.example.units;

import java.util.ArrayList;

public class Peasant extends BaseHero{
    protected int cartridges;
    public Peasant(Vector2D coords){
        super(50.f,50,1,1,2,1,3,coords.posX,coords.posY);
    }
    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        if (!state.equals("Die")) state = "Stand";
    }


    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("фермер/Крестьянин: \t").append(Peasant.super.name)
                .append("\t| ATK:\t").append(Peasant.super.attack)
                .append("\t| HP:\t").append(Peasant.super.hp)
                .append(" \t| Arrows: ").append(Peasant.this.cartridges)
                .append("\t|").append("\t| (X.Y) : ").append(Peasant.super.coords.posX).append(".").append(Peasant.super.coords.posY);
    }
    @Override
    public String toString() {
        return name +
                " \uD83D\uDC97: " + Math.round(hp) +
                " \uD83D\uDEE1️: " + defense +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((damageMin+damageMax)/2)) +
                "\uD83D\uDCAA"+speed+" "+
                state;
    }
}
