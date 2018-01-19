package cooloongwu.com.singleton;

public class Singleton {
    private static Singleton instance;

    /**
     * 防止实例化
     */
    private Singleton() {

    }

    /**
     * synchronized关键字可以解决多线程问题
     *
     * @return 单例
     */
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
