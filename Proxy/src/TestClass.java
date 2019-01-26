import java.lang.reflect.Proxy;

/**
 * @author cookie
 * @Date 2019/1/16
 */
public class TestClass {
    public static void main(String[] args) throws Exception {
        DoService doService = new Do();
        LogProxy logProxy = new LogProxy(doService);
        Class cls = doService.getClass();
        DoService l = (DoService) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), logProxy);
        l.doSomeThing("test");
    }
}
