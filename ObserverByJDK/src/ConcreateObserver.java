import java.util.Observable;
import java.util.Observer;

/**
 * @author cookie
 * @Date 2019/1/19
 */
public class ConcreateObserver implements Observer {

    public ConcreateObserver(String observerName) {
        this.observerName = observerName;
    }

    private String observerName;

    public String getObserverName() {
        return observerName;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Observable" + o);
        System.out.println("Object" + arg);
    }
}
