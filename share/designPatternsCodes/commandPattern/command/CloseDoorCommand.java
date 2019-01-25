package commandPattern.command;

import commandPattern.Commamd;
import commandPattern.homeAppliances.Door;

/**
 * Created by 59177 on 2017/12/19.
 */
public class CloseDoorCommand implements Commamd {
    private Door door;

    public CloseDoorCommand(Door door) {
        this.door = door;
    }

    public void execute() {
        door.close();
    }
}
