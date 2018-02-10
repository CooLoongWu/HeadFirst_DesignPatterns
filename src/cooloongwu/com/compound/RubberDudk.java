package cooloongwu.com.compound;

/**
 * 橡皮鸭
 */
public class RubberDudk implements Quackable {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
