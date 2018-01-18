package cooloongwu.com.decorator;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);//用摩卡装饰改饮料对象
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

    }
}
