package bridgePattern;

/**
 * Created by 59177 on 2017/12/20.
 */
public class Client {

    public static void main(String[] args) {
        //实现
        Implementor impA = new ConcreteImplementorA();
        Implementor impB = new ConcreteImplementorB();

        //抽象
        Abstraction absA = new RefinedAbstractionA(impA);
        Abstraction absB = new RefinedAbstractionB(impB);

        absA.makeYouHappy();
        absB.makeYouHappy();

    }
}
