package cooloongwu.com.welcome;

/**
 * 所有鸭子的父类
 */
public class Duck {

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
    void fly() {
        show("fly");
    }

    void show(String str) {
        System.out.println(str);
    }
}
