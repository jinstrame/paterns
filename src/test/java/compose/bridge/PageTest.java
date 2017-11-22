package compose.bridge;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class PageTest {


    @Parameter
    public Theme inputParam;

    @Parameter(1)
    public String expectedResult;

    @Parameters(name = "{0}")
    public static Collection params() {
        return Arrays.asList(
                new Object[][] {
                        {Theme.DARK, "Homepage Content in DARK"},
                        {Theme.LIGHT, "Homepage Content in LIGHT"}
                }
        );
    }

    @Test
    public void should_get_content_in_corresponding_theme() throws Exception {
        //given
        String expected = expectedResult;
        HomePage homePage = new HomePage(inputParam, "");

        //when
        String actual = homePage.getContent();

        //then
        assertThat(actual, is(expected));
    }

}