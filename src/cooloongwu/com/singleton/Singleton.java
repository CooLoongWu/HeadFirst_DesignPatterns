package cooloongwu.com.singleton;

public class Singleton {
    private static Singleton instance;

    /**
     * 防止实例化
     */
    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
