package org.example.units;
import java.util.ArrayList;
import java.util.Comparator;

public interface GameInterface {

    String  getInfo ();

    void step(ArrayList <BaseHero> enemys, ArrayList <BaseHero> friends);


}

