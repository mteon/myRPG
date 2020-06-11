import Model.Classes.PlayerClass;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        PlayerClass mage = new PlayerClass(PlayerClass.possibleClasses.MAGE);
        mage.initSkillsForMage();
    }
}
