package decoratorPattern.equip;

import decoratorPattern.IEquip;

/**
 * Created by 59177 on 2017/12/19.
 */
public class RingEquip implements IEquip {

    /**
     * 戒指
     * 攻击力 5
     *
     * @return
     */

    public int caculateAttack() {
        return 5;
    }

    public String description() {
        return "麻痹戒指";
    }
}
