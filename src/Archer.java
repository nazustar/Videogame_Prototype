package src;

public class Archer extends Character{

    // Private attributes.
    private String bow;
    private String specialArrows;

    // Constructor.
    public Archer(String bow, String specialSpell) {
        super("Archer", "Archer", 5, 100, 90);
        this.bow = "Silver Bow";
        this.specialArrows = "Poison Arrows";
    }

    @Override
    public Character clone() {
        return new Archer(bow, specialArrows);
    }

    @Override
    public void display(){
        System.out.println("Texto ejemplo :v");
    }
}
