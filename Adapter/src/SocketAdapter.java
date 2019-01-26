/**
 * 适配器
 * 实现了适配对象接口
 * 将目标类引入后，包装在适配对象的方法中
 *
 * @author cookie
 * @Date 2019/1/21
 */
public class SocketAdapter implements DBSocketInterface {
    GBSocketInterface gbSocket;

    public SocketAdapter(GBSocketInterface gbSocket) {
        this.gbSocket = gbSocket;
    }

    @Override
    public void powerWithTwoRound() {
        gbSocket.powerWithThreeFlat();
    }
}
