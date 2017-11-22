package compose.decorator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CoffeeTest {

    @Test
    public void should_return_correct_price_for_decorated_coffe() throws Exception {
        //given
        Coffee original = new SimpleCoffee(5, "water, coffee");

        //when
        Coffee vanilaMilkCoffee = new VanilaCoffee(new MilkCoffee(original));

        //then
        assertThat(vanilaMilkCoffee.getPrice(), is(10));
    }


    @Test
    public void should_return_correct_description_for_decorated_coffe() throws Exception {
        //given
        Coffee original = new SimpleCoffee(5, "water, coffee");

        //when
        Coffee vanilaMilkCoffee = new VanilaCoffee(new MilkCoffee(original));

        //then
        assertThat(vanilaMilkCoffee.getDescription(), is("water, coffee, milk, vanila"));
    }

}