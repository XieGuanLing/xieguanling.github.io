package adapterPattern;

/**
 * Created by 59177 on 2017/12/19.
 */
public class TestInputPower {

    public static void main(String[] args) {
        IphoneX iphoneX = new IphoneX();
        //用适配器转换
        V5Power v5Power = new V5PowerAdapter(new V220Power());

        //充电
        iphoneX.inputPower(v5Power);

    }
}
