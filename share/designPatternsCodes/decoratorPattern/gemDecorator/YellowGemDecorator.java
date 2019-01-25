package decoratorPattern.gemDecorator;

import decoratorPattern.IEquip;
import decoratorPattern.IEquipDecorator;

/**
 * Created by 59177 on 2017/12/19.
 */
public class YellowGemDecorator implements IEquipDecorator {
    /**
     * 黄宝石  +10攻击力
     */

    private IEquip equip;

    public YellowGemDecorator(IEquip equip) {
        this.equip = equip;
    }

    public int caculateAttack() {
        return 10 + equip.caculateAttack();
    }

    public String description() {
        return equip.description() + "+黄宝石";
    }
}
