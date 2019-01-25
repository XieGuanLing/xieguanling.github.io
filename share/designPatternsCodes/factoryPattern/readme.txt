

工厂方法模式
特点：创建方法返回抽象类或接口的实现。

java.util.Calendar#getInstance()
java.util.ResourceBundle#getBundle()
java.text.NumberFormat#getInstance()
java.nio.charset.Charset#forName()
java.net.URLStreamHandlerFactory#createURLStreamHandler(String)对于每个协议（protocol）返回一个单例对象