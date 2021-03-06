* 简单工厂模式介绍
1. 简单工厂模式是属于创建型模式，是工厂模式的一种。简单工厂模式由一个工厂对象决定创建出哪一种产品类的实例。
简单工厂模式是工厂模式家族中最简单实用的模式
2. 简单工厂模式：定义了一个创建对象的类，由这个类来封装实例对象的行为
3. 在软件开发中，当我们会用到大量的创建某种、某类或者某批对象时，就会使用到工厂模式。

* 工厂方法模式介绍
1. 定义了一个创建对象的抽象方法，由子类决定要实例化的类。工厂方法模式将对象的实例化推迟到子类。

* 抽象工厂模式介绍
1. 定义了一个接口用于创建相关或者有依赖关系的对象族，而无需指明具体的类
2. 抽象工厂模式可以将简单工厂模式和工厂模式进行整合
3. 从这几层面看，抽象工厂模式就是对简单工厂模式的改进（或进一步的抽象）
4. 将工厂抽象成两层，抽象工厂和具体实现的工厂子类。程序员可以根据创建对象类型使用对应的工厂子类。
这样将单个的简单工厂类变成了工厂族，便利与代码的维护和扩展。