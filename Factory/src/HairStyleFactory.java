/**
 * 发廊
 *
 * @author cookie
 */
class HairStyleFactory {
    static void cutHair(String key) {
        switch (key) {
            case "left":
                new LeftStyle().draw();
                break;
            case "right":
                new RightStyle().draw();
                break;
            default:
                System.out.println("本店不支持该发行");
        }

    }
}
