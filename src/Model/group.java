package Model;

import java.util.ArrayList;

public class group {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<team> getTeams() {
        return Teams;
    }

    public void setTeams(ArrayList<team> teams) {
        Teams = teams;
    }

    public group(String name, ArrayList<team> teams) {
        this.name = name;
        Teams = teams;
    }

    String name;
    ArrayList<team> Teams;
}

