package src;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {

    private Map<String, Character> prototypes = new HashMap<>();

    // Register a new key for a character.
    public void registerPrototype(String key, Character prototype) {
        prototypes.put(key, prototype);
    }

    // Getter for prototype keys.
    public Character get(String key){
        Character prototype = prototypes.get(key);
        if(prototype == null){
            throw new RuntimeException("No prototype registered for: " + key);
        }
        return prototype.clone();
    }
}