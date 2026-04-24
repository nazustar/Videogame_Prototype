package src;

import java.util.ArrayList;
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
        this.energyPoints = energyPoints;

        this.abilities = new ArrayList<>();
    }

    // Copy Constructor.
    public Character(Character other){
        this.name = other.name;
        this.characterClass = other.characterClass;
        this.level = other.level;
        this.lifePoints = other.lifePoints;
        this.energyPoints = other.energyPoints;

        this.abilities = new ArrayList<>(other.abilities);
    }

    // Method for add Abilities.
    public void addAbility(String ability){
        abilities.add(ability);
    }

    // Abstract for clone.
    public abstract Character clone();
    // Abstract for display.
    public abstract void display();
    
}