package decoratorPattern.equip;

import decoratorPattern.IEquip;

/**
 * Created by 59177 on 2017/12/19.
 */
public class ArmEquip implements IEquip {

    /**
     * 武器
     * 攻击力 20
     *
     * @return
     */

    public int caculateAttack() {
        return 20;
    }

    public String description() {
        return "杀猪刀";
    }
}
