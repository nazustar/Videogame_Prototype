package src;

public class Wizard extends Character{

    // Private attributes.
    private String specialSpell;
    private String wand;

    // Constructor.
    public Wizard(String specialSpell, String wand) {
        super("Merlin", "Wizard", 4, 80, 70);
        this.specialSpell = specialSpell;
        this.wand = wand;

        abilities.add("Disapear");
    }

    @Override
    public Character clone() {
        return new Wizard(this);
    }

    // Copy constructor.
    public Wizard(Wizard other){
        super(other);
        this.specialSpell = other.specialSpell;
        this.wand = other.wand;
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
            "\nSpecial Spell: " + specialSpell +
            "\nWand: " + wand +
            "\nAbilities: " + abilities +
            "\n"
        );
    }
}
