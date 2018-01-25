package cooloongwu.com.template;

/**
 * 咖啡因饮料
 */
public abstract class CaffeineBeverageWithHook {

    /**
     * 方法声明为final，不希望被子类覆盖
     */
    final void prepareRecipe() {
        boilWater();
        brew(); //抽象出来的浸泡方法
        pourInCup();

        if (customerWantsCondiments()) {
            addCondiments();//抽象出来的添加调料的方法
        }
    }

    protected abstract void addCondiments();

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    protected abstract void brew();

    private void boilWater() {
        System.out.println("Boiling water");
    }

    /**
     * 这是一个钩子函数，子类可以选择进行覆盖
     *
     * @return
     */
    boolean customerWantsCondiments() {
        return true;
    }
}
