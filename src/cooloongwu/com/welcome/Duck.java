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

    private void show(String str) {
        System.out.println(str);
    }
}
