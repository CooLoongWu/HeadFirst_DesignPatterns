# 模板方法模式

## 定义
模板方法模式在一个方法中定义了一个算法的股价，而将一些步骤延迟到子类中。模板方法是的子类可以在不改变算法结构的情况下，重新定义算法结构中的某些步骤。

模板方法定义了一个算法的步骤，并允许子类为一个或多个步骤提供实现。


## 要点
“模板方法”定义了算法的步骤，并把这些步骤的实现延迟到子类。

模板方法为我们提供了一种代码复用的重要技巧。

模板方法的抽象类可以定义具体方法，抽象方法和钩子。

抽象方法由子类实现。

钩子是一种方法，他在抽象类中不做事，或者只做默认的事情，子类可以选择要不要去覆盖他。

为了防止子类改变模板方法中的算法，可以将模板方法声明为final。

好莱坞原则告诉我们，将决策权放在高层模块中，以便决定如何以及何时调用底、低层模块。

策略模式和模板方法模式都封装算法，一个用组合一个用继承。

工厂方法是模板方法的一个特殊版本。