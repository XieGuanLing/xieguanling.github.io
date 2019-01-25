注：文章参考《head first设计模式》一书，非常值得学习的一本书。

转载请标明出处：http://blog.csdn.net/lmj623565791/article/details/25837275

这个模式比较简单，嘿嘿，简单写一下。

老样子，先看 外观模式（Facade Pattern）定义：提供一个统一的接口，用来访问子系统中的一群接口，外观定义了一个高层的接口，让子系统更容易使用。其实就是为了方便客户的使用，把一群操作，封装成一个方法。

举个例子：我比较喜欢看电影，于是买了投影仪、电脑、音响、设计了房间的灯光、买了爆米花机，然后我想看电影的时候，我需要：

1、打开爆米花机

2、制作爆米花

3、将灯光调暗

4、打开投影仪

5、放下投影仪投影区

6、打开电脑

7、打开播放器

8、将播放器音调设为环绕立体声

...

尼玛，花了一笔钱，看电影还要这么多的步骤，太累了，而且看完还要一个一个关掉。

所有，我们使用外观模式解决这些复杂的步骤，轻松享受电影：





外观模式
特点：行为方法在内部使用完全不同的抽象类或接口的实例做封装。

javax.faces.context.FacesContext，这个类在内部使用了抽象类或接口LifeCycle、ViewHandler、NavigationHandler以及其他一些用户不需要关心的类
（通常这些类都是可通过注入重写的）。
javax.faces.context.ExternalContext，这个类在内部使用了ServletContext、HttpSession、HttpServletRequest、HttpServletResponse等。