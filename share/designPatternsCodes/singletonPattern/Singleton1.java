package singletonPattern;

/**
 * Created by JunYa on 2017/12/15.
 * 恶汉式单例模式：
 * 直接在加载的时候就加载
 * 可用
 * 缺点：可能不用到，但是也加载、会造成
 */
public class Singleton1 {
    private Singleton1() {
    }

    private static Singleton1 instance = new Singleton1();

    public Singleton1 getInstance() {
        return instance;
    }

}
