package org.example.units;

import java.util.ArrayList;

public class Spearman extends BaseHero {
    int accuracy;

    public Spearman(String name,int x,int y) {
        super(100, name ,  x,y, 33, new int[]{2,12},"воин","копье",8);
        accuracy = 100;

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
