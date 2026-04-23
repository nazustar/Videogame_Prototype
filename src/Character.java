package src;

import java.util.List;

public abstract class Character {

    // Variables.
    protected String name;
    protected String characterClass;
    protected int level;
    protected int lifePoints;
    protected int energyPoints;
    protected List<String> abilities;

    // Constructor.
    public Character(String name, String characterClass, int level, int lifePoints, int energyPoints){
        this.name = name;
        this.characterClass = characterClass;
        this.level = level;
        this.lifePoints = lifePoints;
        this.energyPoints = 100;
    }

    // Abstract for clone.
    public abstract Character clone();

    // Abstract for display.
    public abstract void display();
    
}