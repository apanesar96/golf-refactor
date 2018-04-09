package com.football;

import java.util.Objects;

/*

generates equals and hashcode


test passes

continue to Stats
 */
public class Team {
    private String teamName;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Objects.equals(teamName, team.teamName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(teamName);
    }
}
