package cooloongwu.com.factory;

/**
 * 基本的制作披萨类
 * <p>
 * 后期压力来自于增加更多的披萨类型或者要下架一些披萨类型
 */
public class Pizza {

//    /**
//     * 根据披萨类型实例化具体的类
//     *
//     * @param type 披萨类型
//     * @return 披萨
//     */
//
//    /**
//     * 为了让系统更有弹性我们希望这里可以是一个抽象类或者接口
//     */
//    Pizza orderPizza(String type) {
//        Pizza pizza;
//
//        if (type.equals("cheese")) {
//            pizza = new Pizza();
//        } else if (type.equals("pepperoni")) {
//            pizza = new Pizza();
//        } else if (type.equals("clam")) {
//            pizza = new Pizza();
//        } else {
//            pizza = new Pizza();
//        }
//
//        pizza.prepare();
//        pizza.bake();
//        pizza.cut();
//        pizza.box();
//        return pizza;
//    }

    void prepare() {
        System.out.println("prepare...");
    }

    void bake() {
        System.out.println("bake...");
    }

    void cut() {
        System.out.println("cut...");
    }

    void box() {
        System.out.println("box...");
    }
}
