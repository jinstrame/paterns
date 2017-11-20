package compose.adapter;

public class WildDogAdapter implements Lion {

    private final WildDog dog;

    public WildDogAdapter (WildDog dog){
        this.dog = dog;
    }

    @Override
    public String roar() {
        return dog.bark();
    }
}
