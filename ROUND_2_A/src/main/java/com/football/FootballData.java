package com.football;

public class FootballData {
/*
 convert primitive string to class

 refactor signature


 continues at game

 */
    public static Game[] getAllPlayed() {
        Game[] played = new Game[3];
        played[0] = new Game(new Team("Liverpool"), 2, new Team("Everton"), 0);
        played[1] = new Game(new Team("Aston Villa"), 1, new Team("Liverpool"), 1);
        played[2] = new Game(new Team("Liverpool"), 3,new Team( "West Ham"), 1);
        return played;
    }

}
