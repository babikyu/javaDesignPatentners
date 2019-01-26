/**
 * @author cookie
 * @Date 2019/1/20
 */
public class Animals {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void walk(Walk walk) {
        walk.walkWay();
    }
}
