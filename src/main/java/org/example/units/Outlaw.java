package org.example.units;

import java.util.ArrayList;

public class Outlaw extends BaseHero{
    int knives;
    int accuracy;

    public Outlaw(String name,int x,int y) {
        super(120, name , x, y, 42, new int[]{2,8},"гражданский","нож",8);
        knives =40;
        accuracy = 50;

    }



    @Override
    public void step(ArrayList <BaseHero> enemys, ArrayList <BaseHero> friends) {

    }

    @Override
    public String getInfo() {
        String className = this.getClass().getSimpleName();
        String nameOfHero = name;
        return className+" "+nameOfHero;
    }
}
