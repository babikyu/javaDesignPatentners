/**
 * 单例模式之饿汉模式
 *
 * @author cookie
 * @Date 2019/1/22
 */
public class Singleton1 {
    private Singleton1() {
    }

    static Singleton1 singleton1 = new Singleton1();

    public static Singleton1 getInstance(){
        return Singleton1.singleton1;
    }
}
