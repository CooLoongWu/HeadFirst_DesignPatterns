package cooloongwu.com.strategy;

/**
 * 所有鸭子的父类
 * <p>
 * 经过改造后整合鸭子的行为，已飞行行为为例
 */
public abstract class Duck {

    FlyBehavior flyBehavior;//每只鸭子都会应用实现FlyBehavior接口的对象

    public Duck() {
    }

    void quack() {
        show("quack");
    }

    void swim() {
        show("swim");
    }

    void display() {
        show("display");
    }

    /**
     * 需要添加会飞的属性来将竞争者甩在后头。然而问题随之而来！！
     */
//    void fly() {
//        show("fly");
//    }
    void performFly() {
        //鸭子对象不亲自处理呱呱叫行为，而是委托给flyBehavior引用的对象
        flyBehavior.fly();
    }

    //用设定方法来动态改变鸭子的行为
    void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    void show(String str) {
        System.out.println(str);
    }
}
