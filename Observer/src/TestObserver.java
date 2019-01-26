/**
 * @author cookie
 * @Date 2019/1/19
 */
public class TestObserver {
    public static void main(String[] args) {
        AbsSubject absSubject = new AbsSubject();
        Observer a = new Observer();
        Observer b = new Observer();
        absSubject.addObserver(a);
        absSubject.addObserver(b);
        absSubject.notifyObservers("hello");
    }
}
