package cooloongwu.com.observer;

import java.util.ArrayList;

/**
 * 天气测量数据类，返回包含温度，湿度，气压等数据
 * <p>
 * <p>
 * 我们需要实现三个使用天气数据的布告板
 * “目前状况”不高，“气象统计”不高，“天气预报”布告，一但有新的测量这些不高必须马上更新
 * <p>
 * 此系统必修可扩展，用户可以随想所欲的添加或者删除布告
 * <p>
 * <p>
 * ~~错误的想法：
 * 你可能首先想到最简单的方法就是创建三个布告板类，然后每个类中都有一个update()方法来处理更新
 * 然后在 measurementsChanged() 方法中去调用布告类对象的 update(params... par) 方法
 * 然而这样针对具体实现编程会导致我们后边在添加或者删除布告板类的时候必须要修改代码
 * <p>
 * 而且update(params... par)看起来是一个统一的接口，都有共同的参数温度，湿度，气压
 */
public class WeatherData implements Subject {

    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    float getTemperature() {
        return 111f;
    }

    float getHumidity() {
        return 222f;
    }

    float getPressure() {
        return 333f;
    }

    /**
     * 一但气象测量更新，此方法会被调用（我们不在乎此方法是如何被调用的，我们只在乎他被调用了）
     */
    void measurementsChanged() {
        notifyObservers();
    }


    void mentsChanged() {

    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i > 0) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }
}
