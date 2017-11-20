package instantiate.simplefactory;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class MetalDoorFactoryTest {

    final static int WIDTH = 90;
    final static int HEIGHT = 200;

    @Test
    public void creare() throws Exception {
        Door expected = new Door(WIDTH, HEIGHT, Material.METAL);

        MetalDoorFactory metalDoorFactory = new MetalDoorFactoryImpl();
        Door actual = metalDoorFactory.creare(WIDTH, HEIGHT);

        assertThat(actual, equalTo(expected));
    }

}