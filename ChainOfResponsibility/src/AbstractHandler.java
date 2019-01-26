/**
 * @author cookie
 * @Date 2019/1/17
 */
public abstract class AbstractHandler {
    /**
     * 后继
     */
    private AbstractHandler procced;

    public void setProcced(AbstractHandler procced) {
        this.procced = procced;
    }

    public void doHandler() {
        System.out.println(this.getClass().getSimpleName());
        if (procced != null) {
            procced.doHandler();
        }
    }
}
