package instantiate.simplefactory;

public interface MetalDoorFactory {
    default Door creare(int width, int height) {
        return new Door(width, height, Material.METAL);
    }
}
