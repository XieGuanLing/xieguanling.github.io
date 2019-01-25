package decoratorPattern.gemDecorator;

import decoratorPattern.IEquip;
import decoratorPattern.IEquipDecorator;

/**
 * Created by 59177 on 2017/12/19.
 */
public class BlueGemDecorator implements IEquipDecorator {
    /**
     * 蓝宝石  +5攻击力
     */

    private IEquip equip;

    public BlueGemDecorator(IEquip equip) {
        this.equip = equip;
    }

    public int caculateAttack() {
        return 5 + equip.caculateAttack();
    }

    public String description() {
        return equip.description() + "+蓝宝石";
    }
}
