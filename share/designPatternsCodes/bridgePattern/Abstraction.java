package bridgePattern;

/**
 * Created by 59177 on 2017/12/20.
 * 抽象类接口
 */
public abstract class Abstraction {

    protected Implementor mImp;

    public Abstraction(Implementor implementor) {
        this.mImp = implementor;
    }

    public abstract void makeYouHappy();
}
