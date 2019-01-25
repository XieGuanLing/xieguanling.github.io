package singletonPattern;

/**
 * Created by JunYa on 2017/12/15.
 * 懒加载模式
 * 单例模式懒汉式双重校验锁
 * (极其推荐使用)
 */
public class Singleton2 {
    private Singleton2() {

    }

    private static Singleton2 instance = null;

    public Singleton2 getInstance() {
        if (instance == null) {
            synchronized (Singleton2.class) {
                if (instance == null)
                    instance = new Singleton2();
            }
        }

        return instance;

    }
}
