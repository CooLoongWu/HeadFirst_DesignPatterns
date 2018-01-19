package cooloongwu.com.singleton;

/**
 * 俗称 “饿汉” 式
 */
public class Singleton2 {

    /**
     * 一上来就初始化，利用这个方法，JVM加载这个类时马上创建此唯一的单件实例。
     * <p>
     * JVM保证在任何线程访问instance静态变量之前，一定先创建此实例。
     */
    private static Singleton2 instance = new Singleton2();

    /**
     * 防止实例化
     */
    private Singleton2() {

    }

    /**
     * @return 单例
     */
    public static Singleton2 getInstance() {
        return instance;
    }
}
