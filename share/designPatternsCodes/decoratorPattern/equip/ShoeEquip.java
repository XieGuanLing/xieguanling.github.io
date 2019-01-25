package decoratorPattern.equip;

import decoratorPattern.IEquip;

/**
 * Created by 59177 on 2017/12/19.
 */
public class ShoeEquip implements IEquip {

    /**
     * 鞋子
     * 攻击力 5
     *
     * @return
     */

    public int caculateAttack() {
        return 5;
    }

    public String description() {
        return "攻击鞋";
    }
}
