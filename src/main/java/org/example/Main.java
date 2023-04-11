package org.example.units;


import java.util.ArrayList;
import java.util.Random;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<BaseHero>heroes=team1();
        ArrayList<BaseHero>heroes2=team2();

    heroes2.forEach(n-> System.out.println(n.name+ n.getPosition()));
        System.out.println("──▒▒▒▒▒────▒▒▒▒▒────▒▒▒▒▒────▄████▄─────\n" +
                            "─▒▄─▒▄─▒──▒▄─▒▄─▒──▒▄─▒▄─▒──███▄█▀───────\n" +
                            "─▒▒▒▒▒▒▒──▒▒▒▒▒▒▒──▒▒▒▒▒▒▒─▐████─────────\n" +
                            "─▒▒▒▒▒▒▒──▒▒▒▒▒▒▒──▒▒▒▒▒▒▒──█████▄───────\n" +
                            "─▒─▒─▒─▒──▒─▒─▒─▒──▒─▒─▒─▒───▀████▀─────");
    heroes2.forEach(n-> System.out.println(n.name+ n.getPosition()));
//        System.out.println(team1().get(0).findClosestEnemy(team2()));
        ArrayList <BaseHero> unitedTeams = new ArrayList<>();
        unitedTeams.addAll(heroes);
        unitedTeams.addAll(heroes2);

        cmp(unitedTeams);
        for (BaseHero hero: unitedTeams) {
            if(heroes.contains(hero)) hero.step(heroes2, heroes);
            else hero.step(heroes, heroes2);

        }

        System.out.println(" Отсортированный список: ");
        unitedTeams.forEach((n) -> System.out.println(n));
        System.out.println("Первая команда: ");
        heroes.forEach((n) -> System.out.println(n.name + " " + n.getHp()));
        System.out.println("Вторая команда: ");
        heroes2.forEach((n) -> System.out.println(n.name + " " + n.getHp()));




}
private static void cmp (ArrayList <BaseHero> heroes) {
    heroes.sort((o1, o2) -> {
        if (o1.getInit() - o2.getInit() == 0) {
            return (int) (o1.getHp() - o2.getHp());
        }

        return o2.getInit() - o1.getInit();
    });}
private static String getName(){

    return Names.values()[new Random().nextInt(Names.values().length)].toString();
}
    private static ArrayList<BaseHero> team1(){

        int x =0;
        int y =0;
        ArrayList<BaseHero> team1 = new ArrayList<>();

        for (int i =0;i<10;i++){
            switch (new Random().nextInt(7)){
                case 0:
                    team1.add(new Archer(getName(),x,y+i));
                    break;
                case 1:
                    team1.add(new Crossbowman(getName(),x,y+i));
                    break;
                case 2:
                    team1.add(new Magician(getName(),x,y+i));
                    break;
                case 3:
                    team1.add(new Outlaw(getName(),x,y+i));
                    break;
                case 4:
                    team1.add(new Peasant(getName(),x,y+i));
                    break;
                case 5:
                    team1.add(new Sniper(getName(),x,y+i));
                    break;
                case 6:
                    team1.add(new Spearman(getName(),x,y+i));
                    break;

            }
        }
        return team1;
    }

    private static ArrayList<BaseHero> team2(){
        int x =9;
        int y =0;

        ArrayList<BaseHero> team2 = new ArrayList<>();
        for (int i =0;i<10;i++){
            switch (new Random().nextInt(7)){
                case 0:
                    team2.add(new Archer(getName(),x,y+i));
                    break;
                case 1:
                    team2.add(new Crossbowman(getName(),x,y+i));
                    break;
                case 2:
                    team2.add(new Magician(getName(),x,y+i));
                    break;
                case 3:
                    team2.add(new Outlaw(getName(),x,y+i));
                    break;
                case 4:
                    team2.add(new Peasant(getName(),x,y+i));
                    break;
                case 5:
                    team2.add(new Sniper(getName(),x,y+i));
                    break;
                case 6:
                    team2.add(new Spearman(getName(),x,y+i));
                    break;

            }
        }
        return team2;
    }


}


