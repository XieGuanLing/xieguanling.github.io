具体需求：

1、武器（攻击力20） 、戒指（攻击力5）、护腕（攻击力5）、鞋子（攻击力5）

2、蓝宝石（攻击力5/颗）、黄宝石（攻击力10/颗）、红宝石（攻击力15/颗）

3、每个装备可以随意镶嵌3颗




装饰者模式：若要扩展功能，装饰者提供了比集成更有弹性的替代方案，动态地将责任附加到对象上。

先简单描述下装饰者模式发挥作用的地方，当我们设计好了一个类，我们需要给这个类添加一些辅助的功能，

并且不希望改变这个类的代码，这时候就是装饰者模式大展雄威的时候了。这里还体现了一个原则：类应该对扩展开放，对修改关闭。



装饰模式
特点：创建方法以一个抽象类或接口的实例为参数，返回值是增加了额外方法的给参数实例。

java.io.InputStream、OutputStream、Reader、Writer这些类的所有子类，它们都有一个接受相同类型作为参数的构造函数。
java.util.Collections中checkedXXX()、synchronizedXXX()、unmodifiableXXX()方法
javax.servlet.http.HttpServletRequestWrapper与HttpServletResponseWrapper