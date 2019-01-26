import java.util.LinkedList;
import java.util.List;

/**
 * 目标对象，他知道观察他的观察者，并提供添加和删除观察者的方法
 *
 * @author cookie
 * @Date 2019/1/19
 */
public class AbsSubject {
    private List<Observer> list = new LinkedList<>();

    void addObserver(Observer observer) {
        list.add(observer);
    }


    void removeObserver(Observer observer) {
        list.remove(observer);
    }

    void notifyObservers(String str) {
        list.forEach(x-> x.getChanges(str));
    }

}
