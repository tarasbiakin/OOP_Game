package org.example;

public enum SpellBook {
    healOne(1,-1),healFive(2,-5),healTen(3,-10),
    damageOne(1,1),damageFive(5,2),damageTen(10,3),
    ressurect(25,Float.NaN);
    private final float power;
    private final float cost;

    SpellBook(int cost, float power) {
        this.power=power;
        this.cost=cost;
    }

    public float getPower(){
        return power;
    }

    public float getCost(){
        return cost;
    }
}
