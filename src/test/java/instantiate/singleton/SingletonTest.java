package instantiate.singleton;

import org.junit.Test;

import java.util.Objects;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SingletonTest {
    @Test
    public void getInstance() throws Exception {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        boolean addressEqual = singleton1 == singleton2;
        boolean objectsEqual = Objects.equals(singleton1, singleton2);

        assertThat(addressEqual, is(true));
        assertThat(objectsEqual, is(true));
    }
}