package src;

public class Warrior extends Character{

    // Private attributes.
    private String weapon;
    private String technique;
    private String armor;

    // Constructor.
    public Warrior(String weapon, String technique, String armor) {
        super("Warrior", "Warrior", 1, 70, 100);
        abilities.add("Smash");
        this.weapon = "Spear";
        this.technique = "Hit enemies";
        this.armor = "Silver armor";
    }

    @Override
    public Character clone() {
        return new Warrior(weapon, technique, armor);
    }

    @Override
    public void display(){
        System.out.println("Texto ejemplo :v");
    }
}
