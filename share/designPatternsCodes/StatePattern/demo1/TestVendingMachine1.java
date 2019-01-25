package StatePattern.demo1;

/**
 * Created by 59177 on 2017/12/20.
 */
public class TestVendingMachine1 {

    public static void main(String[] args)
    {
        VendingMachine1 machine = new VendingMachine1(10);
        machine.insertMoney();
        machine.backMoney();

        System.out.println("-----------");

        machine.insertMoney();
        machine.turnCrank();

        System.out.println("----------压力测试-----");
        machine.insertMoney();
        machine.insertMoney();
        machine.turnCrank();
        machine.turnCrank();
        machine.backMoney();
        machine.turnCrank();

    }
}
