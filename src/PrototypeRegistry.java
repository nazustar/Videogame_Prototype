package src;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {

    private Map<String, Character> prototypes = new HashMap<>();

    public void registerPrototype(String key, Character prototype) {
        prototypes.put(key, prototype);
    }

}