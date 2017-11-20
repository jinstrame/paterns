package instantiate.factorymethod;

import org.junit.Test;

import static org.junit.Assert.*;

public class HumanResourceManagerTest {

    @Test
    public void testInterview() throws Exception {
        HumanResourceManager developmentManager = new DevelopmentManager();
        String developerActual = developmentManager.takeInterview();

        HumanResourceManager testingManager = new TestingManager();
        String testerActual = testingManager.takeInterview();

    }


}