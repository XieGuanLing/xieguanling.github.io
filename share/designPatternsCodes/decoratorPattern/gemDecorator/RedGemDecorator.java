package decoratorPattern.gemDecorator;

import decoratorPattern.IEquip;
import decoratorPattern.IEquipDecorator;

/**
 * Created by 59177 on 2017/12/19.
 */
public class RedGemDecorator implements IEquipDecorator {
    /**
     * 红宝石  +15攻击力
     */

    private IEquip equip;

    public RedGemDecorator(IEquip equip) {
        this.equip = equip;
    }

    public int caculateAttack() {
        return 15 + equip.caculateAttack();
    }

    public String description() {
        return equip.description() + "+红宝石";
    }
}
