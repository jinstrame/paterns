package instantiate.singleton;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Singleton {

    private static final Singleton SINGLETON = new Singleton();

    public static Singleton getInstance() {
        return SINGLETON;
    }

    private Singleton() { }
}
