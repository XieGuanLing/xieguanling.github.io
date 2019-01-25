





桥接模式
特点：创建方法接受一个与当前类不同的抽象类或接口的实例作为参数，返回一个经过代理或使用给定参数实例的抽象类或接口的实现。

个可以想到的例子是new LinkedHashMap(LinkedHashSet, List)，这个方法返回一个不可修改的linkedMap，

它就没有拷贝参数中的元素（item），而是直接使用它们。


java.util.Collections#newSetFromMap()和singletonXXX()方法也与之类似。