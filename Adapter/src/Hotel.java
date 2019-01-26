/**
 * 消费适配对象的类
 *
 * @author cookie
 * @Date 2019/1/21
 */
public class Hotel {
    /**
     * 旅馆中有一个德标的插口
     */
    private DBSocketInterface dbSocket;

    public void setDbSocket(DBSocketInterface dbSocket) {
        this.dbSocket = dbSocket;
    }

    public Hotel(){}

    public Hotel(DBSocketInterface dbSocket) {
        this.dbSocket = dbSocket;
    }

    public void charge() {
        dbSocket.powerWithTwoRound();
    }



}
