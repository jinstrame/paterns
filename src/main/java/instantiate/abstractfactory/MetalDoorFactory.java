package instantiate.abstractfactory;

import instantiate.simplefactory.Material;

public class MetalDoorFactory implements AbstractDoorFactory {
    @Override
    public Material getMaterial() {
        return Material.METAL;
    }
}
