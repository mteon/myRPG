package Model;

import Model.Classes.PlayerClass;

import java.util.ArrayList;
import java.util.HashMap;

public class Item {
    private int name;
    private HashMap<String, Integer> statBoosts;
    private int levelRequired;
    private ArrayList<PlayerClass> classRequired;
    private boolean isEquipement;
    private boolean isEquipped;
    private boolean isUsable;

    public int getName() {
        return name;
    }

    public HashMap<String, Integer> getStatBoosts() {
        return statBoosts;
    }

    public int getLevelRequired() {
        return levelRequired;
    }

    public boolean isEquipement() {
        return isEquipement;
    }

    public boolean isEquipped() {
        return isEquipped;
    }

    public ArrayList<PlayerClass> getClassRequired() {
        return classRequired;
    }

    public boolean isUsable() {
        return isUsable;
    }
}
