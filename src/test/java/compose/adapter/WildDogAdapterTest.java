package compose.adapter;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class WildDogAdapterTest {

    @Test
    public void testAdapter() throws Exception {
        LionHunter hunter = new LionHunter();

        Lion lion = new MountainLion();
        String huntLion = hunter.hunt(lion);

        assertThat(lion.roar(), is("lion roar"));
        assertThat(huntLion, is("i hunt"));

        WildDog dog = new WildDog();

        WildDogAdapter wildDogAdapter = new WildDogAdapter(dog);

        assertThat(dog.bark(), is(wildDogAdapter.roar()));
        assertThat(wildDogAdapter.roar(), is("dog bark"));
        assertThat(hunter.hunt(wildDogAdapter), is("i hunt"));
    }
}