package compose.composition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CompositionTest {

    @Test
    public void testComposition() throws Exception {
        //given
        Employee e1 = new Developer("John", 10000);
        Employee e2 = new Designer("Sara", 12345);
        Organization organization = new Organization();

        organization.addEmployee(e1);
        organization.addEmployee(e2);

        //when
        int allSalaries = organization.getNetSalary();

        //then
        assertThat(allSalaries, is(e1.getSalary() + e2.getSalary()));
    }

}