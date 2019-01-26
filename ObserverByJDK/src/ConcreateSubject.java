import java.util.Observable;

/**
 * @author cookie
 * @Date 2019/1/19
 */
public class ConcreateSubject extends Observable {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.setChanged();
        this.notifyObservers(content);
    }

}
