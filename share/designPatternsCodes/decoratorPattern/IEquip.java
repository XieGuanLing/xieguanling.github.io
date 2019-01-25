package decoratorPattern;

/**
 * Created by 59177 on 2017/12/19.
 */
public interface IEquip {

    /**
     * 计算攻击力
     *
     * @return
     */
    public int caculateAttack();

    /**
     * 描述装备
     *
     * @return
     */
    public String description();
}
