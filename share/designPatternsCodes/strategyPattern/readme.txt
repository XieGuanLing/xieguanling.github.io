








策略模式
特点：在一个抽象类或接口的行为方法会调用作为一种策略实现而通过参数传入的另一个抽象类或接口实例的方法。

java.util.Comparator#compare()，这个方法被Collections#sort()所调用
javax.servlet.http.HttpServlet类中的service()与所有的doXXX()方法接受HttpServletRequest与HttpServletResponse这两个参数（并不是通过像成员变量这种方式容纳它们），这样其所有子类都必须去处理它们
javax.servlet.Filter#doFilter()





