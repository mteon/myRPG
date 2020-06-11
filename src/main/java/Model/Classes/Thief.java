package Model.Classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Thief extends PlayerClass {
    public Thief(possibleClasses name) {
        super(name);
    }

    @Override
    public HashMap<String, Integer> initSkills() throws IOException {
        if (this.getName() == possibleClasses.THIEF) {
            String pathToSkillFile = "src/main/java/Datas/SkillDatas/ThiefSkills";
            HashMap<String, Integer> skills = new HashMap<>();
            String line;
            BufferedReader skillFileReader = new BufferedReader(new FileReader(pathToSkillFile));
            while ((line = skillFileReader.readLine()) != null) {
                String[] parts = line.split(":", 2);
                if (parts.length >= 2) {
                    String skillName = parts[0];
                    int skillLevel = Integer.parseInt(parts[1]);
                    skills.put(skillName, skillLevel);
                }
            }
            for (String skill:skills.keySet()) {
                System.out.println(skill + ":" + skills.get(skill));
            }
        }
        return this.getSkills();
    }

    @Override
    public HashMap<String, Integer> initStats() throws IOException {
        if (this.getName() == possibleClasses.THIEF) {
            String pathToSkillFile = "src/main/java/Datas/StatDatas/ThiefStats";
            HashMap<String, Integer> skills = new HashMap<>();
            String line;
            BufferedReader skillFileReader = new BufferedReader(new FileReader(pathToSkillFile));
            while ((line = skillFileReader.readLine()) != null) {
                String[] parts = line.split(":", 2);
                if (parts.length >= 2) {
                    String skillName = parts[0];
                    int skillLevel = Integer.parseInt(parts[1]);
                    skills.put(skillName, skillLevel);
                }
            }
            for (String skill:skills.keySet()) {
                System.out.println(skill + ":" + skills.get(skill));
            }
        }
        return this.getStats();
    }
}
