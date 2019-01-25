package commandPattern;

import commandPattern.command.*;
import commandPattern.homeAppliances.Computer;
import commandPattern.homeAppliances.Door;
import commandPattern.homeAppliances.Light;

/**
 * Created by 59177 on 2017/12/19.
 */
public class TestCommand {

    public static void main(String[] args) {
        //三个家家电
        Door door = new Door();
        Light light = new Light();
        Computer computer = new Computer();

        //所有的功能
        OpenDoorCommand openDoorCommand = new OpenDoorCommand(door);
        CloseDoorCommand closeDoorCommand = new CloseDoorCommand(door);
        OpenLightCommand openLightCommand = new OpenLightCommand(light);
        CloseLightCommand closeLightCommand = new CloseLightCommand(light);
        OpenComputerCommand openComputerCommand = new OpenComputerCommand(computer);
        CloseComputerCommand closeComputerCommand = new CloseComputerCommand(computer);
        //一键关闭所有
        QuickCommand quickCommand = new QuickCommand(new Commamd[]{closeDoorCommand, closeComputerCommand, closeLightCommand});

        //自定义功能对应的数字
        ControlPanel controlPanel = new ControlPanel();
        controlPanel.setCommand(0, openDoorCommand);
        controlPanel.setCommand(1, closeDoorCommand);
        controlPanel.setCommand(2, openLightCommand);
        controlPanel.setCommand(3, closeLightCommand);
        controlPanel.setCommand(4, openComputerCommand);
        controlPanel.setCommand(5, closeComputerCommand);
        //设置一键开启所有功能
        controlPanel.setCommand(6, quickCommand);

        //使用遥控
        controlPanel.pressKey(0);
        controlPanel.pressKey(2);
        controlPanel.pressKey(4);
        System.out.println("--------------------------一键关闭");
        controlPanel.pressKey(6);

    }
}
