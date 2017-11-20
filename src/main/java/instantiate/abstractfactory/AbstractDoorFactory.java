package instantiate.abstractfactory;

import instantiate.simplefactory.Door;
import instantiate.simplefactory.Material;

public interface AbstractDoorFactory {

    Material getMaterial();

    default Door create(int width, int height) {
        return new Door(width, height, getMaterial());
    }

    default DoorMaster getMaster() {
        return new DoorMaster(getMaterial());
    }
}
