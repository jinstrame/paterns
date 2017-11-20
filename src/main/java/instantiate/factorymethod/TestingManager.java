package instantiate.factorymethod;

public class TestingManager implements HumanResourceManager {
    @Override
    public Interviewer createInterviewer() {
        return new Tester();
    }
}
