package commandPattern.command;

import commandPattern.Commamd;
import commandPattern.homeAppliances.Light;

/**
 * Created by 59177 on 2017/12/19.
 */
public class CloseLightCommand implements Commamd {

    private Light light;

    public CloseLightCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.close();
    }
}
