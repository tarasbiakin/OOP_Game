package org.example.units;

import java.util.ArrayList;

public class Archer extends BaseHero {
    int arrows;
    int accuracy;
    public Archer(String name,int x,int y) {
        super(150, name ,x,y, 6,  new int[]{1,10},"воин","лук",10);
        arrows = 20;
        accuracy = 90;

    }


    @Override
    public String getInfo() {
        String className = this.getClass().getSimpleName();
        String nameOfHero = name;
        return className+" "+nameOfHero;
    }
}
