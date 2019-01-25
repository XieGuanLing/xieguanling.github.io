package bridgePattern;

/**
 * Created by 59177 on 2017/12/20.
 */
public class RefinedAbstractionB extends Abstraction {

    public RefinedAbstractionB(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void makeYouHappy() {
        System.out.println("B类型的妹子");
        mImp.skill();
    }
}
