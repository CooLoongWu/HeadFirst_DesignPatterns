package cooloongwu.com.adapter;

public class Main {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();

        //假装是鸭子的火鸡
        Duck adapter = new TurkeyAdapter(wildTurkey);

        wildTurkey.gobble();
        wildTurkey.fly();

        mallardDuck.quack();
        mallardDuck.fly();

        adapter.quack();
        adapter.fly();
    }
}
