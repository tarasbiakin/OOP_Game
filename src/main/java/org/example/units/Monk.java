package org.example.units;

import java.util.ArrayList;

public class Monk extends Wizard {

    public Monk(String name) {
        super(120, name , 2, 3, 8, new int[]{2,20},"воин","книга заклинаний",20,4,2,8);

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
