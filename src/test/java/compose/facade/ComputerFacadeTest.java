package compose.facade;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ComputerFacadeTest {

    @Test
    public void should_do_every_step_when_run_through_facade() throws Exception {
        //given
        Computer computer = new Computer();
        ComputerFacade facade = new ComputerFacade(computer);

        //when
        String executed = facade.strat();

        //then
        assertThat(executed, is("whooooooo beep beep vvvzzzzzzz"));
    }
}