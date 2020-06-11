package Model.Classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public abstract class PlayerClass {
    private possibleClasses name;
    private HashMap<String, Integer> skills;
    private HashMap<String, Integer> stats;

    public PlayerClass(possibleClasses name) {
        this.name = name;
        this.skills = new HashMap<>();
        this.stats = new HashMap<>();
    }

    public possibleClasses getName() {
        return name;
    }

    public HashMap<String, Integer> getSkills() {
        return skills;
    }

    public HashMap<String, Integer> getStats() {
        return stats;
    }

    public enum possibleClasses {
        WARRIOR,
        MAGE,
        PRIEST,
        THIEF,
        MARTIAL_ARTIST,
        HERO,
        BARD,
    }

    public abstract HashMap<String, Integer> initSkills() throws IOException;

    public abstract HashMap<String, Integer> initStats() throws IOException;


}
