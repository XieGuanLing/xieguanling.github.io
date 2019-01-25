package StatePattern.state;

import StatePattern.State;
import StatePattern.VendingMachine;

/**
 * Created by 59177 on 2017/12/20.
 */
public class SoldOutState implements State {

    private VendingMachine machine;

    public SoldOutState(VendingMachine machine) {
        this.machine = machine;
    }

    public void insertMoney() {
        System.out.println("投币失败，商品已售罄");
    }

    public void backMoney() {
        System.out.println("您未投币，想退钱么？...");
    }

    public void turnCrank() {
        System.out.println("商品售罄，转动手柄也木有用");
    }

    public void dispense() {
        throw new IllegalStateException("非法状态！");
    }
}
