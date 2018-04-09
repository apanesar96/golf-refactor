package com.football;

/*
      create get teamScoreOf function
      extract variable of team
      continues at game data
 */

import java.util.Arrays;

public class FootballScoreStats {

    public int teamTotal(String teamName) {
      //  int total = 0;

        Game[] played = FootballData.getAllPlayed();
        Team team = new Team(teamName);
        return Arrays.stream(played)
            .map(game -> game.getTeamScoreOf(team))
            .reduce(0,(previous,next) -> previous+next);

       // Game[] played = FootballData.getAllPlayed();

        /*for (Game game : played) {
            total += game.getTeamScoreOf(team);
        }*/

        //return total;
    }

}
