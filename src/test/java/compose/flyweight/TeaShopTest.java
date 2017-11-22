package compose.flyweight;

import javafx.util.Pair;
import org.junit.Test;

import static org.hamcrest.core.AllOf.allOf;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.*;

public class TeaShopTest {

    @Test
    public void should_serve_nothing_if_no_orders() throws Exception {
        //given
        TeaShop teaShop = new TeaShop();

        //when
        Pair<Integer, BlackTea> integerBlackTeaPair = teaShop.serveNext();

        //then
        assertThat(integerBlackTeaPair, is(nullValue()));
    }

    @Test
    public void should_bring_same_tea_with_same_params() throws Exception {
        //given
        TeaShop teaShop = new TeaShop();
        teaShop.order("param", 1);
        teaShop.order("param", 2);

        //when
        BlackTea tea1 = teaShop.serveNext().getValue();
        BlackTea tea2 = teaShop.serveNext().getValue();

        //then
        assertThat(tea1, is(tea2));
    }

}