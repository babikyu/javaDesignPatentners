/**
 * @author cookie
 * @Date 2019/1/21
 */
public class TestCharge {
    public static void main(String[] args) {
        DBSocketInterface dbSocketInterface = new DBSocket();
        Hotel hotel = new Hotel(dbSocketInterface);
        hotel.charge();

        DBSocketInterface adapter = new SocketAdapter(new GBSocket());
        Hotel hotel1 = new Hotel(adapter);
        hotel1.charge();
    }
}
