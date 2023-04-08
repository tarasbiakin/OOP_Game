package org.example.units;


import java.util.ArrayList;

public class Magician extends Wizard {


    public Magician(String name,int x,int y) {
        super(150, name , x, y, 12, new int[]{2,30},"воин","лук",22,12,5,8);

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
