package instantiate.abstractfactory;

import instantiate.simplefactory.Door;
import instantiate.simplefactory.Material;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class AbstractDoorFactoryTest {

    int WIDTH = 90;
    int HEIGHT = 200;

    @Test
    public void testAbstractFactory() throws Exception {
        Door expectedWoodDoor = new Door(WIDTH, HEIGHT, Material.WOOD);
        Door expectedMetalDoor = new Door(WIDTH, HEIGHT, Material.METAL);

        DoorMaster expectedWoodMaster = new DoorMaster(Material.WOOD);
        DoorMaster expectedMetalMaster = new DoorMaster(Material.METAL);


        AbstractDoorFactory doorFactory = new WoodenDoorFactory();

        Door actualWoodDoor = doorFactory.create(WIDTH, HEIGHT);
        DoorMaster actualWoodMaster = doorFactory.getMaster();

        doorFactory = new MetalDoorFactory();
        Door actualMetalDoor = doorFactory.create(WIDTH, HEIGHT);
        DoorMaster actualMetalMaster = doorFactory.getMaster();

        assertThat(actualMetalDoor, equalTo(expectedMetalDoor));
        assertThat(actualWoodDoor, equalTo(expectedWoodDoor));
        assertThat(actualMetalMaster, equalTo(expectedMetalMaster));
        assertThat(actualWoodMaster, equalTo(expectedWoodMaster));
    }
}