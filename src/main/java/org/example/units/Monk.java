package org.example.units;

public class Monk extends Wizard {
    public Monk(Vector2D coords){
        super(45.f,45,10,-7,-7,3,7,5,5,coords.posX,coords.posY);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Монах:  \t").append(Monk.super.name)
                .append("\t| ATK:\t").append(Monk.super.attack)
                .append("\t| HP:\t").append(Monk.super.hp)
                .append(" \t| MP:\t").append(Monk.super.mana)
                .append("\t|").append("\t| (X.Y) : ").append(Monk.super.coords.posX).append(".").append(Monk.super.coords.posY);
    }
    @Override
    public String toString() {
        return name +
                " \uD83D\uDC97: " + Math.round(hp) +
                " \uD83D\uDEE1️: " + defense +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((damageMin+damageMax)/2)) +
                " Mana:" + mana + " " +
                "\uD83D\uDCAA"+speed+" "+
                state;
    }

}