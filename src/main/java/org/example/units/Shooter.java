package org.example.units;
import java.util.concurrent.ThreadLocalRandom;

import java.util.ArrayList;
import java.util.Random;
public abstract class Shooter  extends BaseHero{

    int arrows;
    int accuracy;
    public Shooter(float hp, String name,int x,int y, int armor, int[] damage, String clas_name, String weapon,int arrows,int accuracy,int initiative) {
        super(hp, name, x,y, armor, damage, clas_name, weapon,initiative);

        this.arrows = arrows;
       this.accuracy  = accuracy;
    }
    public void step(ArrayList<BaseHero> enemies, ArrayList <BaseHero> friends) {
        if (!ifAlive() || !ifArrows()) return;
        shoot(nearest(enemies));

        if (!ifPeasant(friends)) arrows -=1;

    }
    public Boolean ifArrows() {
        return arrows > 0;
    }

    public void shoot(BaseHero enemy){
        int randomNum = ThreadLocalRandom.current().nextInt(damage[0], damage[1] + 1);
        enemy.getDamage(randomNum);
    }

    public boolean ifPeasant(ArrayList <BaseHero> friends) {

        for (int i = 0; i < friends.size(); i++) {
            if (friends.get(i).getInfo().equals("Я крестьянин!") && (friends.get(i).state.equals("stand"))){
                friends.get(i).state = "busy";
                return true;
            }
        }
        return false;
    }





}
