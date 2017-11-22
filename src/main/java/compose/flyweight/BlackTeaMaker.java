package compose.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BlackTeaMaker {
    private Map<String, BlackTea> storage = new HashMap<>();

    public BlackTea maker(String params) {
        if (!storage.containsKey(params)){
            storage.put(params, new BlackTea());
        }
        return storage.get(params);
    }
}
