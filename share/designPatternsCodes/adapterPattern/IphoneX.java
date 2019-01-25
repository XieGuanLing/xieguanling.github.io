package adapterPattern;

/**
 * Created by 59177 on 2017/12/19.
 */
public class IphoneX {

    /**
     * 充电
     */
    public void inputPower(V5Power v5Power) {
        int power = v5Power.provideV5Power();

        System.out.printf("用了电压为：" + power);

    }

}
