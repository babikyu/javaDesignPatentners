/**
 * @author cookie
 * @Date 2019/1/20
 */
public class TestStrategy {
    public static void main(String[] args) {
        Animals dog = new Animals();
        dog.walk(() -> System.out.println("dog"));
        Animals pig = new Animals();
        pig.walk(() -> System.out.println("pig"));
    }
}
