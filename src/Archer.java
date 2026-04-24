package src;

public class Archer extends Character{

    // Private attributes.
    private String bow;
    private String specialArrows;

    // Constructor.
    public Archer(String bow, String specialArrows) {
        super("Guillermo", "Archer", 5, 100, 90);
        //Revisar datos inicializados.
        this.bow = bow;
        this.specialArrows = specialArrows;

        abilities.add("Fast arrow");
    }

    // Clone method from character.
    @Override
    public Character clone() {
        return new Archer(this);
    }

    // Copy constructor.
    public Archer(Archer other){
        super(other);
        this.bow = other.bow;
        this.specialArrows = other.specialArrows;
    }

    // Display method from character.
    @Override
    public void display(){
        System.out.println(
            "Name: " + name +
            "\nClass: " + characterClass +
            "\nLevel: " + level +
            "\nLife: " + lifePoints +
            "\nEnergy: " + energyPoints +
            "\nBow: " +  bow +
            "\nSpecial Arrows: " + specialArrows +
            "\nAbilities: " + abilities +
            "\n"
        );
    }
}
