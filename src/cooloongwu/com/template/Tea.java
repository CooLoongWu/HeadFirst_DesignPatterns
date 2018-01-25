package cooloongwu.com.template;

/**
 * 用来煮茶
 */
public class Tea {

    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        addLemon();
        pourInCup();
    }

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void steepTeaBag() {
        System.out.println("Steeping the tea");
    }

    public void addLemon() {
        System.out.println("Adding lemon");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
