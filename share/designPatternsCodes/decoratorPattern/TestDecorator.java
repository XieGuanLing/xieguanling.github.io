package decoratorPattern;

import decoratorPattern.equip.ArmEquip;
import decoratorPattern.equip.ShoeEquip;
import decoratorPattern.gemDecorator.BlueGemDecorator;
import decoratorPattern.gemDecorator.RedGemDecorator;
import decoratorPattern.gemDecorator.YellowGemDecorator;

/**
 * Created by 59177 on 2017/12/19.
 */
public class TestDecorator {
    public static void main(String[] args) {

        //一个镶嵌了 两个蓝宝石、一个红宝石的鞋子

        IEquip shoeEquip=new BlueGemDecorator(new BlueGemDecorator(new RedGemDecorator(new ShoeEquip())));
        System.out.println("该鞋子的攻击力为"+shoeEquip.caculateAttack());
        System.out.println(shoeEquip.description());

        System.out.println("-----------------------------------");

        //一个镶嵌了  一个蓝宝石  一个红宝石  一个黄宝石的杀猪刀

        IEquip armEquip=new BlueGemDecorator(new RedGemDecorator(new YellowGemDecorator(new ArmEquip())));
        System.out.println("该武器的攻击力为"+armEquip.caculateAttack());
        System.out.println(armEquip.description());






    }
}
