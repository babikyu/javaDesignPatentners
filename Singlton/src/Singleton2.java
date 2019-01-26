/**
 * 单例模式之懒汉模式
 *
 * @author cookie
 * @Date 2019/1/22
 */
public class Singleton2 {
    private Singleton2() {
    }

    private static Singleton2 singleton2;

    static Singleton2 getInstance() {
        if (null == singleton2) {
            singleton2 = new Singleton2();
        }

        return singleton2;
    }
}
