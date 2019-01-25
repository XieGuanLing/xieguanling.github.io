package strategyPattern.behavior;

import strategyPattern.IDisplayBehavior;

/**
 * Created by 59177 on 2017/12/18.
 */
public class DisplayGDS implements IDisplayBehavior {

    public void display() {
        System.out.println("展示高大傻");
    }
}
