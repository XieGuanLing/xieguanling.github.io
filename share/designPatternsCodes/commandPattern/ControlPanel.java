package commandPattern;

import commandPattern.command.NotCommand;

/**
 * Created by 59177 on 2017/12/19.
 */
public class ControlPanel {
    //9键格
    private static final int CONTROL_SIZE = 9;
    //所有自定义的功能
    private Commamd[] commamds;

    //初始化自定义功能
    public ControlPanel() {
        Commamd[] commamds = new Commamd[CONTROL_SIZE];
        for (int i = 0; i < CONTROL_SIZE; i++) {
            commamds[i] = new NotCommand();
        }
        this.commamds = commamds;
    }


    //自定义各个功能对应的按键
    public void setCommand(int index, Commamd commamd) {
        commamds[index] = commamd;
    }

    public void pressKey(int index) {
        if (index > 8)
            return;
        commamds[index].execute();
    }


}
