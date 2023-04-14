package org.example.units;
import java.util.ArrayList;
import java.util.Comparator;

public interface GameInterface {

    StringBuilder  getInfo ();

    void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2);


}

