package org.example.units;



public class Spearman extends Warrior{
    public Spearman(Vector2D coords){
        super(70.f,70,10,2,5,14,5,coords.posX,coords.posY);
    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Копейщик:\t").append(Spearman.super.name)
                .append("\t| ATK:\t").append(Spearman.super.attack)
                .append("\t| HP:\t").append(Spearman.super.hp)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Spearman.super.coords.posX).append(".").append(Spearman.super.coords.posY);
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
