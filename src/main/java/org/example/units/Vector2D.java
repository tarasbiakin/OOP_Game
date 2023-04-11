package org.example.units;

public class Coordinates { protected int posX;
    protected int posY;

    public Coordinates(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    protected boolean isLeft(Coordinates oponent){
        return posX < oponent.posX;
    }

    protected double getDistance(Coordinates oponent){
        return Math.sqrt(Math.pow(posX - oponent.posX,2) + Math.pow(posY - oponent.posY,2));
    }
}
