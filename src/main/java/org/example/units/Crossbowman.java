package org.example.units;

import java.util.ArrayList;

public class Crossbowman extends Shooter{

    public Crossbowman(String name,int x,int y) {
        super(180, name , x, y, 38, new int[]{1,12},"воин","арбалет",10,75,10);

    }




    @Override
    public String getInfo() {
        String className = this.getClass().getSimpleName();
        String nameOfHero = name;
        return className+" "+nameOfHero;
    }

    @Override
    public void step(ArrayList<BaseHero> enemys, ArrayList<BaseHero> friends) {

    }
}
