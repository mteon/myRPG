package Model.Monsters;

import Model.Item;

import java.util.ArrayList;
import java.util.HashMap;

public class MonsterType {
    private String name;
    private HashMap<String, Integer> skills;
    private HashMap<String, Integer> stats;
    private ArrayList<Item> loots;
    public boolean isUnique;

    public String getName() {
        return name;
    }

    public ArrayList<Item> getLoots() {
        return loots;
    }

    public boolean isUnique() {
        return isUnique;
    }

    public HashMap<String, Integer> getSkills() {
        return skills;
    }

    public HashMap<String, Integer> getStats() {
        return stats;
    }
}
