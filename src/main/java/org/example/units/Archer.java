package org.example.units;


public class Archer extends Shooter {
    public Archer(Vector2D coords){
        super(60.f,60,8,4,6,4,9,20,10,coords.posX,coords.posY);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Лук: \t").append(Archer.super.name)
                .append("\t| ATK:\t").append(Archer.super.attack)
                .append("\t| HP:\t").append(Archer.super.hp)
                .append(" \t| Arrows:").append(Archer.super.ammo)
                .append("\t|").append("\t| (X.Y) : ").append(Archer.super.coords.posX).append(".").append(Archer.super.coords.posY);


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
