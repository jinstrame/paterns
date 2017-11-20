package instantiate.builder;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class BurgerTest {

    public static final boolean CHEESE = true;
    public static final boolean TOMATO = false;
    public static final boolean CHILI = false;
    public static final boolean ICEBERG = false;



    @Test
    public void testBuilder() throws Exception {
        Burger expectedBurger = new Burger(CHEESE, TOMATO, CHILI, ICEBERG);

        Burger actualBurger = Burger.builder()
                .cheese(CHEESE)
                .tomato(TOMATO)
                .chili(CHILI)
                .iceberg(ICEBERG)
                .build();

        assertThat(actualBurger, equalTo(expectedBurger));
    }

}