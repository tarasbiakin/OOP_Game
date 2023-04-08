package org.example.units;

import java.util.ArrayList;
import java.util.Random;

public abstract class BaseHero implements GameInterface{
    protected float hp;
    protected float maxHp;
    public String name;
    protected int x,y;
    protected int armor;
    protected int def;
    protected int[] damage;
    protected String clas_name;

    protected String weapon;
    protected int initiative;
    protected static Random r;
    protected Position position;
    protected String state;


    public BaseHero(float hp, String name, int x,int y, int armor, int[] damage,String clas_name,String weapon,int initiative){
        this.hp = this.maxHp= hp;
        this.name = name;
        this.x =x;
        this.y =y;
        this.armor = armor;
        this.def = def;
        this.damage = damage;
        this.clas_name=clas_name;
        this.weapon = weapon;
        this.initiative = initiative;
        position = new Position(x, y);
        this.state = "stand";

    }

    @Override
    public void step(ArrayList<BaseHero> enemys, ArrayList <BaseHero> friends) {

    }
    public Boolean ifAlive (){
        return hp > 0;}

    public BaseHero nearest (ArrayList<BaseHero> otherHeroes) {
        float min = 10;
        BaseHero nearestHero = null;
        for (int i = 0; i < otherHeroes.size(); i++) {
            if (this.position.distance(otherHeroes.get(i)) < min); nearestHero = otherHeroes.get(i);

        }
        return nearestHero;
    }

    public void getDamage(int damage){
        if(this.hp-damage>0){
            this.hp=hp-damage;
        }

    }
    public void die(){}


    public int getInit (){
        return initiative;
    }

    public float getHp() {
        return hp;
    }

    @Override
    public String toString(){
        return name+" "+ hp+""+" "+armor+" "+ clas_name;
    }

    public String getPosition(){
        return "  x:" +this.x +" y:" + this.y;
    }

}
