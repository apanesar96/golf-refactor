package com.football;

public class FootballScoreStats {

    private final GameData footballData;

    public FootballScoreStats(GameData footballData) {
        this.footballData = footballData;
    }

    public int teamTotal(String teamName) {
        int total = 0;
        Game[] played = footballData.getAllPlayed();
        for (Game game : played) {
            total += game.getTeamScore(teamName);
        }
        return total;
    }

}
