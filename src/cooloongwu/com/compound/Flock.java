package cooloongwu.com.compound;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {

    Observable observable;
    ArrayList<Quackable> quackers = new ArrayList<>();

    public Flock() {
        observable = new Observable(this);
    }

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        //迭代器模式
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quackable = (Quackable) iterator.next();
            quackable.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
