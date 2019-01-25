先看下定义：定义了一个算法的骨架，而将一些步骤延迟到子类中，模版方法使得子类可以在不改变算法结构的情况下，重新定义算法的步骤。

简单看下定义，模版方法定义了一个算法的步骤，并且允许子类为一个或多个步骤提供实现。定义还算清晰，下面来个例子展示下本公司的上班情况

（纯属娱乐，如有雷同，请对号入座）。简单描述一下：本公司有程序猿、测试、HR、项目经理等人，下面使用模版方法模式，记录下所有人员的上

班情况




模板方法模式
特点：具有由抽象类型定义默认行为的行为方法。

java.io.InputStream、java.io.OutputStream、java.io.Reader与java.io.Writer类的所有非抽象方法
java.util.AbstractList、java.util.AbstractSet、java.util.AbstractMap的所有非抽象方法
javax.servlet.http.HttpServlet类的所有doXXX()方法默认发送HTTP 405“方法不允许”这个错误给response，你可以自由地选择是否去实现它们