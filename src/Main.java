package src;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        PrototypeRegistry registry = new PrototypeRegistry();

        // For demostrate each character.

        // Register new characters.
        registry.registerPrototype("Warrior", new Warrior("Spear", "Hit enemies", "Silver armor"));
        registry.registerPrototype("Archer", new Archer("Wood bow", "Fire arrows"));
        registry.registerPrototype("Wizard", new Wizard("Fireball", "Magic wand"));


        // For demostrate masive clonation.

        List<Character> army = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            army.add(registry.get("Warrior"));
            army.add(registry.get("Archer"));
            army.add(registry.get("Wizard"));
        }
        System.out.println("Total characters cloned: " + army.size());
        System.out.println("---------------------------------------");
        System.out.println("Showing 3 character copy info.");

        // (Each character) Clonation of characters.
        Character warrior1 = registry.get("Warrior");
        Character wizard1 = registry.get("Wizard");
        Character archer1 = registry.get("Archer");

        // Show results of clonation.
        System.out.println("Warrior #1");
        warrior1.display();

        System.out.println("Wizard #1");
        wizard1.display();

        System.out.println("Archer #1");
        archer1.display();
    }
}