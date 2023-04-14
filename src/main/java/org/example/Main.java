package org.example;

import org.example.units.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int UNITS = 10;
    public static ArrayList<BaseHero> darkTeam = new ArrayList<>();
    public static ArrayList<BaseHero> holyTeam = new ArrayList<>();
    public static ArrayList<BaseHero> allTeam = new ArrayList<>();

    public static void main(String[] args) {
        init();
        Scanner input = new Scanner(System.in);
        while (true){
            allTeam = sortTeam();
            View.view();  // отображение в консоль
            input.nextLine();
            for (BaseHero human: allTeam) {
                if (holyTeam.contains(human)) human.step(holyTeam, darkTeam);
                else human.step(darkTeam, holyTeam);
            }
        }
    }

    private static void init() {
        for (int i = 0; i < UNITS; i++) {
            int rnd = new Random().nextInt(7);
            switch (rnd) {
                case (0):
                    darkTeam.add(new Sniper(new Vector2D(i+1, 1)));
                    break;
                case (1):
                    darkTeam.add(new Outlaw(new Vector2D(i+1, 1)));
                    break;
                case (2):
                    darkTeam.add(new Monk(new Vector2D(i+1, 1)));
                    break;
                default:
                    darkTeam.add(new Peasant(new Vector2D(i+1, 1)));
            }

            rnd = new Random().nextInt(7);
            switch (rnd) {
                case (0):
                    holyTeam.add(new Peasant(new Vector2D(i+1, 10)));
                    break;
                case (1):
                    holyTeam.add(new Crossbowman(new Vector2D(i+1, 10)));
                    break;
                case (2):
                    holyTeam.add(new Magician(new Vector2D(i+1, 10)));
                    break;
                default:
                    holyTeam.add(new Spearman(new Vector2D(i+1, 10)));
            }
        }
    }
    private static ArrayList<BaseHero> sortTeam (){
        ArrayList<BaseHero> list = new ArrayList<>();
        list.addAll(darkTeam);
        list.addAll(holyTeam);
        list.sort(new Comparator<BaseHero>() {
            @Override
            public int compare(BaseHero t0, BaseHero t1) {
                if (t1.getSpeed() == t0.getSpeed()) return (int) (t1.getHp() - t0.getHp());
                else  return (int) (t1.getSpeed() - t0.getSpeed());
            }
        });
        return list;
    }
}