package cooloongwu.com.observer;

/**
 * 主题类
 * <p>
 * 包含注册和取消注册方法。这两个方法都需要一个观察者变量
 * <p>
 * notifyObservers() 用以当主题状态改变时通知所有的观察者
 */
public interface Subject {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}
