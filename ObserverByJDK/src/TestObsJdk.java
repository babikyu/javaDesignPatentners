/**
 * @author cookie
 * @Date 2019/1/19
 */
public class TestObsJdk {
    public static void main(String[] args) {
        ConcreateSubject weather = new ConcreateSubject();
        ConcreateObserver mom = new ConcreateObserver("mom");
        ConcreateObserver girl = new ConcreateObserver("girl");
        weather.addObserver(mom);
        weather.addObserver(girl);
        weather.setContent("天气晴");

    }
}
