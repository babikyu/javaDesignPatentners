/**
 * @author cookie
 * @Date 2019/1/16
 */
public class Do implements DoService {
    @Override
    public void doSomeThing(String thing) throws InterruptedException {
        System.out.println("做一件事情：" + thing);
        Thread.sleep(3000);
        System.out.println("做完了");
    }
}
