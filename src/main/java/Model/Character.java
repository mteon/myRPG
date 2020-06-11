package Model;

import Model.Classes.PlayerClass;

import java.util.ArrayList;

public class Character {
    private String name;
    private String sex;
    private PlayerClass playerClass;
    private long hp;
    private long currentHP;
    private long mana;
    private long currentMana;
    private int level;
    private long totalExp;
    private long expToLvlUp;
    private boolean isPlayer;
    private ArrayList<Item> inventory;

    //temporary
    public Character(String name, String sex, PlayerClass playerClass, boolean isPlayer) {
        this.name = name;
        this.sex = sex;
        this.playerClass = playerClass;
        this.hp = 25;
        this.mana = 10;
        this.currentHP = this.hp;
        this.currentMana = this.mana;
        this.level = 1;
        this.totalExp = 100;
        this.expToLvlUp = 100;
        this.isPlayer = isPlayer;
        this.inventory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSex() { return sex; }

    public PlayerClass getPlayerClass() {
        return playerClass;
    }

    public long getHp() {
        return hp;
    }

    public long getMana() {
        return mana;
    }

    public int getLevel() {
        return level;
    }

    public long getTotalExp() {
        return totalExp;
    }

    public long getExpToLvlUp() {
        return expToLvlUp;
    }

    public boolean isPlayer() {
        return isPlayer;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }
}
