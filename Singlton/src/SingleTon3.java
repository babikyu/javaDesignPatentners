/**
 * @author cookie
 * @Date 2019/1/22
 */
public enum SingleTon3 {
    INSTANCE;

    private Resource instance;

    SingleTon3() {
        instance = new Resource();
    }

    public Resource getInstance() {
        return instance;
    }
}

class Resource{}
