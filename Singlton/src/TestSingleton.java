/**
 * @author cookie
 * @Date 2019/1/22
 */
public class TestSingleton {
    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton11 = Singleton1.getInstance();
        Singleton2 singleton2 = Singleton2.getInstance();
        Singleton2 singleton22 = Singleton2.getInstance();
        Resource singleTon3 = SingleTon3.INSTANCE.getInstance();
        Resource singleTon33 = SingleTon3.INSTANCE.getInstance();
        // 饿汉模式
        System.out.println(singleton1 == singleton11);
        // 懒汉模式
        System.out.println(singleton2 == singleton22);
        // 单例模式
        System.out.println(singleTon3 == singleTon33);

    }
}
