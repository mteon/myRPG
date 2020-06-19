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

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setPlayerClass(PlayerClass playerClass) {
        this.playerClass = playerClass;
    }

    public void setHp(long hp) {
        this.hp = hp;
    }

    public void setCurrentHP(long currentHP) {
        this.currentHP = currentHP;
    }

    public void setMana(long mana) {
        this.mana = mana;
    }

    public void setCurrentMana(long currentMana) {
        this.currentMana = currentMana;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setTotalExp(long totalExp) {
        this.totalExp = totalExp;
    }

    public void setExpToLvlUp(long expToLvlUp) {
        this.expToLvlUp = expToLvlUp;
    }

    public void setPlayer(boolean player) {
        isPlayer = player;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

    public boolean isPlayer() {
        return isPlayer;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setHeroStats () {
            this.setHp(this.getHp()*(5/4));
            this.setCurrentHP(this.getHp());
            this.setMana(this.getMana()*(5/4));
            this.setCurrentMana(this.getMana());
    }

    public void setMageStats () {
        this.setHp(this.getHp()*(11/10));
        this.setCurrentHP(this.getHp());
        this.setMana(this.getMana()*(7/5));
        this.setCurrentMana(this.getMana());
    }

    public void setWarriorStats () {
        this.setHp(this.getHp()*(3/2));
        this.setCurrentHP(this.getHp());
        this.setCurrentMana(this.getMana());
    }

    public void setPriestStats () {
        this.setHp(this.getHp()*(11/10));
        this.setCurrentHP(this.getHp());
        this.setMana(this.getMana()*(7/5));
        this.setCurrentMana(this.getMana());
    }

    public void setBardStats () {
        this.setHp(this.getHp()*(11/10));
        this.setCurrentHP(this.getHp());
        this.setMana(this.getMana()*(7/5));
        this.setCurrentMana(this.getMana());
    }

    public void setThiefStats () {
        this.setHp(this.getHp()*(6/5));
        this.setCurrentHP(this.getHp());
        this.setMana(this.getMana()*(6/5));
        this.setCurrentMana(this.getMana());
    }

    public void setMAStats () {
        this.setHp(this.getHp()*(8/6));
        this.setCurrentHP(this.getHp());
        this.setCurrentMana(this.getMana());
    }

    public void lvlUp () {
        if(this.getExpToLvlUp() == 0) {
            this.setLevel(this.getLevel()+1);
            this.setTotalExp(this.getTotalExp()*(3/2));
            this.setExpToLvlUp(this.getTotalExp());
            if (this.getPlayerClass().getName() == PlayerClass.possibleClasses.HERO) {
                setHeroStats();
            }
            if (this.getPlayerClass().getName() == PlayerClass.possibleClasses.MAGE) {
                setMageStats();
            }
            if (this.getPlayerClass().getName() == PlayerClass.possibleClasses.PRIEST) {
                setPriestStats();
            }
            if (this.getPlayerClass().getName() == PlayerClass.possibleClasses.BARD) {
                setBardStats();
            }
            if (this.getPlayerClass().getName() == PlayerClass.possibleClasses.WARRIOR) {
                setWarriorStats();
            }
            if (this.getPlayerClass().getName() == PlayerClass.possibleClasses.THIEF) {
                setThiefStats();
            }
            if (this.getPlayerClass().getName() == PlayerClass.possibleClasses.MARTIAL_ARTIST) {
                setMAStats();
            }
        }
    }
}
