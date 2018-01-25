package cooloongwu.com.template;

/**
 * 咖啡因饮料
 */
public abstract class CaffeineBeverage {

    /**
     * 方法声明为final，不希望被子类覆盖
     */
    final void prepareRecipe() {
        boilWater();
        brew(); //抽象出来的浸泡方法
        pourInCup();
        addCondiments();//抽象出来的添加调料的方法
    }

    protected abstract void addCondiments();

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    protected abstract void brew();

    private void boilWater() {
        System.out.println("Boiling water");
    }


}
