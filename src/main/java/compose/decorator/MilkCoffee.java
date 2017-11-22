package compose.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MilkCoffee implements Coffee {

    private Coffee coffee;

    @Override
    public int getPrice() {
        return coffee.getPrice() + 2;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", milk";
    }
}
