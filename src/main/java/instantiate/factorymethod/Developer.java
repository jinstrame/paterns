package instantiate.factorymethod;

public class Developer implements Interviewer {
    @Override
    public String askQuestion() {
        return "Question about design patterns";
    }
}
