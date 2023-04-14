package org.example.units;

public class Outlaw extends Warrior{
    int disguise;
    public Outlaw(Vector2D coords){
        super(70.f,70,10,2,5,14,5,coords.posX,coords.posY);

    this.disguise = 50;
    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Вор: \t").append(Outlaw.super.name)
                .append("\t| ATK:\t").append(Outlaw.super.attack)
                .append("\t| HP:\t").append(Outlaw.super.hp)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Outlaw.super.coords.posX).append(".").append(Outlaw.super.coords.posY);
    }

    @Override
    public String toString() {
        return name +
                " \uD83D\uDC97: " + Math.round(hp) +
                " \uD83D\uDEE1️: " + defense +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((damageMin+damageMax)/2)) +
                "\uD83D\uDC63"+speed+" "+
                state;
    }
}
