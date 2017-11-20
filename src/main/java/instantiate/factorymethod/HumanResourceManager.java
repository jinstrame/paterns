package instantiate.factorymethod;

public interface HumanResourceManager {
    Interviewer createInterviewer();

    default String takeInterview() {
        return createInterviewer().askQuestion();
    }
}
