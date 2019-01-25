package strategyPattern.behavior;

import strategyPattern.IDefendBehavior;

/**
 * Created by 59177 on 2017/12/18.
 */
public class DefendTBS implements IDefendBehavior {

    public void defend() {
        System.out.println("铁布衫");
    }
}
