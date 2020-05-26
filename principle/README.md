## 设计模式六大原则
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;设计模式原则，其实就是**程序员在编码时，应当遵守的原则**，也是**设计模式的基础**（**设计模式为什么这样设计的依据**）

设计模式常用的六大原则
1. 单一职责原则
2. 接口隔离原则
3. 依赖倒转（倒置）原则
4. 里氏替换原则
5. 开闭原则（OCP）
6. 迪米特法则

## 单一职责原则
### 基本介绍
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;对类来说的，**及一个类应该只负责一想职责。**如类A负责二个不同职责：职责1，职责2.当职责一需求变更而改变A类时，可能造成职责2执行错误，所以需要将类A的粒度分解为A1,A2
### 注意事项和细节
1. 降低类的复杂度，一个类只负责一项职责
2. 提高类的可读性，可维护性
3. 降低变更引起的风险
4. 通常情况下，我们应该遵守单一职责原则，只有逻辑足够简单，才可以在代码级违反单一原则。只有类中的方法数量足够少，可以在方法级别保持单一职责原则

## 接口隔离原则
### 基本介绍
1. 客户端不应该依赖它不需要的接口，即**一个类对另一个类的依赖应该建立在最小的接口**上
2. 先看一下这个图![在这里插入图片描述](https://img-blog.csdnimg.cn/20200525155425405.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2FiZWxldGhhbg==,size_16,color_FFFFFF,t_70)
3. 类A通过接口Interface1依赖类B，类C通过接口Interface1依赖类D如果接口Interface1对于类A和类C来说不是最小接口，那么类B和类D必须去实现他们不需要的方法
4. 接口隔离原则应当这样处理：
将接口Interface1拆分为独立的几个接口（这里我们拆分为三个接口），类A和类C分别于他们需要的接口建立依赖关系。也就是采用接口隔离原则

## 依赖倒转（倒置）原则
### 基本介绍
依赖倒转原则（Dependence Inversion Principle）是指：
1. 高层模块不应该依赖底层模块，二者都应该依赖其抽象
2. **抽象不应该依赖细节，细节应该依赖抽象**
3. 依赖倒转（倒置）的中心思想是**面向接口编程**
4. 依赖倒转原则是基于：相对于细节的多变性，抽象的东西要稳定的多。以抽象为基础搭建的架构比以细节为基础的架构要稳定的多。在java中，抽象指的是接口或抽象类，细节就是具体的实现类。
5. 使用**接口或抽象类**的目的是制定好**规范**，而不涉及任何具体的操作，把**展现细节的任务交给他们的实现类**去完成。
### 依赖关系传递的三种方式和应用案例
1. 接口传递
```java
public interface ITV {
    void play();
}

public interface IOpenAndClose {

    void open(ITV tv);
}

public class OpenAndClose implements IOpenAndClose {
    @Override
    public void open(ITV tv) {
        tv.play();
    }
}

public class ChangHong implements ITV{
    @Override
    public void play() {
        System.out.println("长虹电视机打开");
    }
}

public class Test {
    public static void main(String[] args) {
        ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(changHong);
    }
}
```
2. 构造方法传递
```java
public interface ITV {
    void play();
}

public interface IOpenAndClose {
    void open();
}

public class OpenAndClose implements IOpenAndClose {
	private ITV tv;
	
	public OpenAndClose(ITV tv){
		this.tv = tv;
	}

    @Override
    public void open() {
        this.tv.play();
    }
}

public class ChangHong implements ITV{
    @Override
    public void play() {
        System.out.println("长虹电视机打开");
    }
}

public class Test {
    public static void main(String[] args) {
        ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose = new OpenAndClose(changHong );
        openAndClose.open();
    }
}
```
3. setter方法传递
```java
public interface ITV {
    void play();
}

public interface IOpenAndClose {
    void open();

	void setTv(ITV tv);
}

public class OpenAndClose implements IOpenAndClose {
	private ITV tv;
	
    @Override
    public void open() {
        this.tv.play();
    }

	@Override
    public void setTv(ITV tv) {
        this.tv = tv;
    }
}

public class ChangHong implements ITV{
    @Override
    public void play() {
        System.out.println("长虹电视机打开");
    }
}

public class Test {
    public static void main(String[] args) {
        ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv();
        openAndClose.open();
    }
}
```
### 注意事项和细节
1. 底层模块尽量都要有抽象类或接口，或者二者都有，程序稳定性更好。
2. 变量的**声明类型尽量是抽象类或接口**，这样我们的变量引用和实际对象间，就存在**一个缓冲层**，利于程序扩展和优化。
3. 继承时遵循**里氏替换原则**

## 里氏替换原则
### OO中的继承性的思考和说明
1. 继承包含这样一层含义：父类中凡是已经实现好的方法，实际上是在设定规范和契约，虽然它不强制要求所有的子类必须遵循这些契约，但是如果子类对这些已经实现的方法任意修改，就会对整个继承体系造成破坏
2. **继承在给程序设计带来便利的同时，也带来了弊端**。比如使用继承会给程序带来**侵入性**，程序的可移植性降低，添加对象间的耦合性，如果一个类被其它的类所继承，则当这个类需要修改时，必须考虑到所有的子类，并且父类修改后，所有涉及到子类的功能都有可能产生故障
3. 问题提出：**在编程中，如何正确的使用继承**？=>**里氏替换原则**
### 基本介绍
1. 里氏替换原则（Liskov Substitution Principle）在1988年，由麻省理工学院的以为姓里的女士提出。
2. 如果对每个类型为T1的对象o1，都有类型为T2的对象o2，使得以T1定义的所有程序P在所有的对象o1都代换成o2时，程序P的行为没有发生变化，那么类型T2是类型T1的子类。**换句话说，所有引用基类的地方必须能透明的使用其子类的对象**。
3. 在使用继承时，遵循里氏替换原则，在**子类中尽量不要重写父类的方法**
4. 里氏替换园子告诉我们，继承实际上让二个类耦合性增强了，在适当的情况下，可以通过**聚合，组合，依赖 来解决问题**

## 开闭原则（OCP）
### 基本介绍
1. 开闭原则（Open Closed Principle）是编程中最基础、最重要的设计原则
2. 一个软件实体类，模块和函数应该**对扩展开放（对提供方）**，对**修改关闭（对使用方）**。用抽象构建框架，用实现扩展细节。
3. 当软件需要变化时，尽量**通过扩展软件**实体的行为来实现变化，而不是**通过修改**已有的代码来实现变化。
4. 编程中遵循其它原则，以及使用设计模式的目的就是遵循开闭原则

## 迪米特法则
### 基本介绍
1. 一个对象应该对其它对象保持最少的了解
2. 类与类关系越密切，耦合度越大
3. 迪米特法则（Demeter Principle）又叫**最少知道原则**，即一个类**对自己依赖的类知道的越少越好**。也就是说，对于被依赖的类不管多么复杂，都尽量将逻辑封装在类的内部。对外除了提供的public方法，不对外泄露任何信息
4. 迪米特法则还有个更简单的定义：只与直接的朋友通信
5. **直接朋友**：每个对象都会与其他对象有**耦合关系**，只要二个对象之间有耦合关系，我们就说这两个对象之间是朋友关系。耦合的方式很多，依赖，关联，组合，聚合等。其中，我们称**成员变量，方法参数，方法返回值**中的类为直接朋友，而出现在**局部变量中的类不是直接的朋友**。也就是说，陌生的类最好不要以局部变量的形式出现在类的内部
### 注意事项和细节
1. 迪米特法则的核心是降低类之间的耦合
2. 但是注意：由于每个类都减少了不必要的依赖，因此迪米特法则只是要求降低类间（对象间）耦合关系，并不是要求完全没有依赖关系

## 合成复用原则（补充内容）
### 基本介绍
 尽量使用合成/聚合的方式，而不是使用继承
### 设计原则核心思想
1. 找出应用中可能需要变化之处，把它们独立出来，不要和那些不需要变化的代码混在一起
2. 针对接口编程，而不是针对实现编程
3. 为了交互对象之间的**松耦合设计而努力**