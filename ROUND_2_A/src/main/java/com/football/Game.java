package com.football;

public class Game {

    /* change field to type TEAM

        test not passes

        continue to team

    * */

    private Team homeTeam;
    private int homeTeamScore;
    private Team awayTeam;
    private int awayTeamScore;

    public Game(Team homeTeam, int homeTeamScore, Team awayTeam, int awayTeamScore) {
        this.homeTeam = homeTeam;
        this.homeTeamScore = homeTeamScore;
        this.awayTeam = awayTeam;
        this.awayTeamScore = awayTeamScore;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public int getHomeTeamScore() {
        return homeTeamScore;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public int getAwayTeamScore() {
        return awayTeamScore;
    }

    public int getTeamScoreOf(Team team) {
        if(team.equals(homeTeam)){
            return getHomeTeamScore();
        }
        if(team.equals(awayTeam)){
            return getAwayTeamScore();
        }
        return 0;
    }
}
