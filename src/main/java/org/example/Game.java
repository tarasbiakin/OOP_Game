//package org.example;
//
//import org.example.View;
//import org.example.units.BaseHero;
//import org.example.units.Names;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class Game {
//    public Game() {
//    }
//
//    protected boolean gameEnded() {
//        return BaseHero.filterLiveTeam(BaseHero.getHolyTeam()).isEmpty() || BaseHero.filterLiveTeam(BaseHero.getDarkTeam()).isEmpty();
//    }
//
//    public void startGame() {
//        printHeader("Игра начинается");
//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        int turnsCounter = 0;
//        createTeams();
//        while (!gameEnded() && !Objects.equals(input, "q")) {
//            System.out.println("Нажмите enter для продолжения, или введите q для выхода");
//            input = scanner.nextLine();
//            if (Objects.equals(input, "q")) break;
//            View.view();
//            turnsCounter++;
////            System.out.println("Ход №" + turnsCounter);
////            showTeams();
//            teamsMakeTurns();
//        }
//        if (gameEnded()) {
//            View.view();
//            printHeader("Игра закончена");
//            printWin();
//        }
//    }
//
//    public static String getName() {
//        return Names.values()[new Random().nextInt(Names.values().length)].toString();
//    }
//
//    protected void printWin() {
//        if (BaseHero.filterLiveTeam(BaseHero.getHolyTeam()).isEmpty())
//            printHeader("Все персонажи в первой команде мертвы\nПобедила вторая команда");
//        else
//            printHeader("Все персонажи во второй команде мертвы\nПобедила первая команда");
//    }
//
//}
