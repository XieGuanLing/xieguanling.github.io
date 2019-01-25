package StatePattern;

/**
 * Created by 59177 on 2017/12/20.
 * 各种状态的超类
 */
public interface State {

    /**
     * 放钱
     */
    public void insertMoney();

    /**
     * 退钱
     */
    public void backMoney();

    /**
     * 转动曲柄
     */
    public void turnCrank();

    /**
     * 出商品
     */
    public void dispense();
}
