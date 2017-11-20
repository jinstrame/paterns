package instantiate.factorymethod;

public class DevelopmentManager implements HumanResourceManager {
    @Override
    public Interviewer createInterviewer() {
        return new Developer();
    }
}
