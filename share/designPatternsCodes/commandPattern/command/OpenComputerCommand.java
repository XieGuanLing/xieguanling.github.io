package commandPattern.command;

import commandPattern.Commamd;
import commandPattern.homeAppliances.Computer;

/**
 * Created by 59177 on 2017/12/19.
 */
public class OpenComputerCommand implements Commamd {
    private Computer computer;

    public OpenComputerCommand(Computer computer) {
        this.computer = computer;
    }

    public void execute() {
        computer.open();
    }
}
