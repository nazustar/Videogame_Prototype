package src;

public class Wizard extends Character{

    // Private attributes.
    private String specialSpell;
    private String wand;

    // Constructor.
    public Wizard(String specialSpell, String wand) {
        super("Wizard", "Wizard", 4, 80, 70);
        this.specialSpell = "Open All Doors";
        this.wand = "Wood Wand";
        abilities.add("Dissapear");
    }

    @Override
    public Character clone() {
        return new Wizard(specialSpell, wand);
    }

    @Override
    public void display(){
        System.out.println("Texto ejemplo :v");
    }
}
