package org.example.units;

public class Magician extends Wizard {
    public Magician(Vector2D coords){
        super(50.f,50,10,-7,-7,3,7,5,5,coords.posX,coords.posY);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Маг:  \t").append(Magician.super.name)
                .append("\t| ATK:\t").append(Magician.super.attack)
                .append("\t| HP:\t").append(Magician.super.hp)
                .append(" \t| MP:\t").append(Magician.super.mana)
                .append("\t|").append("\t| (X.Y) : ").append(Magician.super.coords.posX).append(".").append(Magician.super.coords.posY);
    }

}

