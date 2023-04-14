package org.example.units;

import java.util.ArrayList;

public class Crossbowman extends Shooter{
    public Crossbowman(Vector2D coords){
        super(70.f,70,6,4,7,4,9,21,10,coords.posX,coords.posY);
    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Арбалет: \t").append(Crossbowman.super.name)
                .append("\t| ATK:\t").append(Crossbowman.super.attack)
                .append("\t| HP:\t").append(Crossbowman.super.hp)
                .append(" \t| Arrows:").append(Crossbowman.super.ammo)
                .append("\t|").append("\t| (X.Y) : ").append(Crossbowman.super.coords.posX).append(".").append(Crossbowman.super.coords.posY);
    }
    @Override
    public String toString() {
        return name +
                " \uD83D\uDC97: " + Math.round(hp) +
                " \uD83D\uDEE1️: " + defense +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((damageMin+damageMax)/2)) +
                "➴" + ammo + " " +
                "\uD83D\uDCAA"+speed+" "+
                state;
    }
}
