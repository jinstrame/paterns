package instantiate.prototype;

import org.junit.Test;

import java.util.Objects;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SheepTest {

    @Test
    public void testClone() throws Exception {

        Sheep originalSheep = new Sheep("Dolly", "Mountain");

        Sheep newSheep = originalSheep.clone();

        boolean addressEquals = newSheep == originalSheep;
        boolean contentEquals = Objects.equals(newSheep, originalSheep);

        assertThat(addressEquals, is(false));
        assertThat(contentEquals, is(true));

    }

}