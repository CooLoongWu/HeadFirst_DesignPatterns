package cooloongwu.com.singleton;

/**
 * 如果性能是你关心的重点，那么这个做法可以帮你大大的减少getInstance()的时间耗费。
 */
public class Singleton3 {

    /**
     * 使用volatile关键字
     */
    private static volatile Singleton3 instance;

    /**
     * 防止实例化
     */
    private Singleton3() {

    }

    /**
     * @return 单例
     */
    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
