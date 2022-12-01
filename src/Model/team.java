package Model;

import java.util.ArrayList;

public class team {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJersey_color() {
        return jersey_color;
    }

    public void setJersey_color(String jersey_color) {
        this.jersey_color = jersey_color;
    }

    public String getFifa_ranking() {
        return fifa_ranking;
    }

    public void setFifa_ranking(String fifa_ranking) {
        this.fifa_ranking = fifa_ranking;
    }

    public ArrayList<players> getPlayers() {
        return Players;
    }

    public void setPlayers(ArrayList<players> players) {
        Players = players;
    }

    public team(String name, String jersey_color, String fifa_ranking, ArrayList<players> players) {
        this.name = name;
        this.jersey_color = jersey_color;
        this.fifa_ranking = fifa_ranking;
        Players = players;
    }

    String name;
    String jersey_color;
    String fifa_ranking;
    ArrayList<players>Players;

    }