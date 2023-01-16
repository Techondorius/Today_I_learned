/**
 *プログラム名       :   Ex060
 *引数1              :   なし
 *学籍番号           :   22JY0133
 *名前               :   藤田恭輔
 */

public class Ex060 {
    public static void main(String[] args) {
        Robot rb1 = new Robot("EVA-01");
        Robot.showRobot(rb1);

        Robot rb2 = new Robot("AV-98");
        Robot.showRobot(rb2);
    }
}

class Robot {
    private String name;
    private static int count = 0;

    Robot(String name) {
        this.name = name;
        count += 1;
    }

    void showName() {
        System.out.printf("ロボット：%s\n", name);
    }

    static void showCount() {
        System.out.printf("ロボットの製造台数：%s\n", count);
    }

    static void showRobot(Robot rb) {
        System.out.printf("ロボット：%s\nロボットの製造台数：%s\n", rb.name, count);
    }
}
