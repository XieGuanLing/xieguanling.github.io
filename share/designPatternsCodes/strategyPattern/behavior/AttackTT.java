package strategyPattern.behavior;

import strategyPattern.IAttackBehavior;

/**
 * Created by 59177 on 2017/12/18.
 */
public class AttackTT implements IAttackBehavior {

    public void attack() {
        System.out.println("猴子偷桃");

    }
}
