import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author cookie
 * @Date 2019/1/15
 */
public class LogProxy implements InvocationHandler {

    private Object target;

    public LogProxy(Object object) {
        super();
        this.target = object;
    }

    /**
     *
     * @param proxy 被代理的对象
     * @param method 被代理对象的方法
     * @param args 方法的参数
     * @return Object 方法的返回值
     * @throws Throwable 异常
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println("开始时间：" + startTime);
        // target method的owner
        method.invoke(target, args);
        long endTime = System.currentTimeMillis();
        System.out.println("结束时间：" + endTime);
        return null;
    }
}
