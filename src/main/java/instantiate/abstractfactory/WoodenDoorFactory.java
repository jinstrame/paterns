package instantiate.abstractfactory;

import instantiate.simplefactory.Material;

public class WoodenDoorFactory implements AbstractDoorFactory {
    @Override
    public Material getMaterial() {
        return Material.WOOD;
    }
}
