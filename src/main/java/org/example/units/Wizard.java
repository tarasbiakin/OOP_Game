package org.example.units;

public abstract class Wizard extends BaseHero implements GameInterface{
    int mana;
    int recovery;

    int LifeElexir;

    public Wizard(float hp, String name, int x,int y, int armor, int[] damage, String clas_name, String weapon,int mana,int recovery, int LifeElexir,int iniciative) {
        super(hp, name, x,y, armor, damage, clas_name, weapon,iniciative);

        this.mana=mana;
        this.recovery = recovery;
        this.LifeElexir = LifeElexir;
    }



}
