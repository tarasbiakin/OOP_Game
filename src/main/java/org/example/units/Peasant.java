package org.example.units;

import java.util.ArrayList;

public class Peasant extends BaseHero{
        int portable_stock;
    public Peasant(String name,int x,int y) {
        super(100, name , x,y, 0, new int[]{1,2},"гражданский","серп",2);

        portable_stock = 70;

    }


    @Override
    public String getInfo() {
        String className = this.getClass().getSimpleName();
        String nameOfHero = name;
        return className+" "+nameOfHero;
    }

    @Override
    public void step(ArrayList <BaseHero> enemys, ArrayList <BaseHero> friends) {

    }
}
