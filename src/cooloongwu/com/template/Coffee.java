package cooloongwu.com.template;

/**
 * 咖啡类，用来煮咖啡
 */
public class Coffee extends CaffeineBeverage {

    @Override
    protected void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    protected void brew() {
        System.out.println("Dripping Coffee through filter");
    }

}
