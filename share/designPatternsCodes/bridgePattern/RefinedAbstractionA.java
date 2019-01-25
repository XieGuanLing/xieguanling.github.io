package bridgePattern;

/**
 * Created by 59177 on 2017/12/20.
 */
public class RefinedAbstractionA  extends Abstraction {

    public RefinedAbstractionA(Implementor implementor) {
        super(implementor);
    }

    public void makeYouHappy() {
        System.out.println("A类型的妹子");
        mImp.skill();
    }
}
