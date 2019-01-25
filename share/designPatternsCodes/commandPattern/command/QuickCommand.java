package commandPattern.command;

import commandPattern.Commamd;

/**
 * Created by 59177 on 2017/12/19.
 */
public class QuickCommand implements Commamd {
    private Commamd[] commamds;

    public QuickCommand(Commamd[] commamds) {
        this.commamds = commamds;
    }

    public void execute() {
        for (int i = 0; i < commamds.length; i++) {
            commamds[i].execute();
        }

    }

}
