package compose.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class VanilaCoffee implements Coffee {
    private Coffee coffee;

    @Override
    public int getPrice() {
        return coffee.getPrice() + 3;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", vanila";
    }
}
