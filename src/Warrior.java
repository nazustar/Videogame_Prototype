package src;

public class Warrior extends Character{

    // Private attributes.
    private String weapon;
    private String technique;
    private String armor;

    // Constructor.
    public Warrior(String weapon, String technique, String armor) {
        super("Ethan", "Warrior", 1, 70, 100);
        this.weapon = weapon;
        this.technique = technique;
        this.armor = armor;

        abilities.add("Smash");
        abilities.add("Burn");
    }

    // Copy constructor.
    public Warrior(Warrior other){
        super(other);
        this.weapon = other.weapon;
        this.technique = other.technique;
        this.armor = other.armor;
    }

    @Override
    public Character clone() {
        return new Warrior(this);
    }

    // Display method from character.
    @Override
    public void display() {
        System.out.println(
            "Name: " + name +
            "\nClass: " + characterClass +
            "\nLevel: " + level +
            "\nLife: " + lifePoints +
            "\nEnergy: " + energyPoints +
            "\nWeapon: " + weapon +
            "\nTechnique: " + technique +
            "\nArmor: " + armor +
            "\nAbilities: " + abilities +
            "\n"
        );
    }
}
