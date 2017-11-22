package compose.facade;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ComputerFacade {

    private Computer computer;

    public String strat() {
        return computer.startFirtsStep() + " " +
        computer.startSecondStep() + " " +
        computer.startThirdStep();
    }
}
