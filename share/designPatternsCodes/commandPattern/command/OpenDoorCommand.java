package commandPattern.command;

import commandPattern.Commamd;
import commandPattern.homeAppliances.Door;

/**
 * Created by 59177 on 2017/12/19.
 */
public class OpenDoorCommand implements Commamd {

    private Door door;

    public OpenDoorCommand(Door door) {
        this.door = door;
    }

    public void execute() {
        door.open();
    }
}
