/**
 * @author cookie
 * @Date 2019/1/17
 */
public class TestCOR {
    public static void main(String[] args) {
        AbstractHandler aHandler = new AHandler();
        aHandler.setProcced(new BHandler());
        aHandler.doHandler();
    }
}
