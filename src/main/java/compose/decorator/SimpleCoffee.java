package compose.decorator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SimpleCoffee implements Coffee {
    private int price;
    private String description;
}
