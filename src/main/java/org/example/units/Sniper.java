package org.example.units;

import java.util.ArrayList;

public class Sniper extends Shooter{

    public Sniper(String name,int x,int y) {
        super(120, name , x, y, 22, new int[]{1,8},"воин","лук",12,70,10);


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

//    @Override
//    public String toString() {
//        String s = super.toString();
//        return s;
//    }
}
