package Model;

import Model.Monsters.MonsterType;

public class Monster {
    private MonsterType type;
    private int level;
    private long hp;
    private long mana;
    private long xpGiven;

    public MonsterType getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public long getHp() {
        return hp;
    }

    public long getMana() {
        return mana;
    }

    public long getXpGiven() {
        return xpGiven;
    }
}
