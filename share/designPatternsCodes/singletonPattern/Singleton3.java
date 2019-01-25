package singletonPattern;

/**
 * Created by JunYa on 2017/12/15.
 * 内部类[推荐用]
 * 不会出现线程不安全问题、JVM只会加载一次
 */
public class Singleton3 {
    private Singleton3() {
    }

    private static class singletonHolder {
        private static Singleton3 instance = new Singleton3();
    }

    public Singleton3 getInstance() {
        return singletonHolder.instance;
    }

}

//这种方式跟饿汉式方式采用的机制类似，但又有不同。两者都是采用了类装载的机制来保证初始化实例时只有一个线程。不同
//
//        的地方在饿汉式方式是只要Singleton类被装载就会实例化，没有Lazy-Loading的作用，而静态内部类方式在Singleton类被装载时
//
//        并不会立即实例化，而是在需要实例化时，调用getInstance方法，才会装载SingletonHolder类，从而完成Singleton的实例化。
//
//        类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程是
//
//        无法进入的。
//
//        优点：避免了线程不安全，延迟加载，效率高
