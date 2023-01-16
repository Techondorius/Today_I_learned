/**
 *プログラム名       :   Ex059
 *引数1              :   なし
 *学籍番号           :   22JY0133
 *名前               :   藤田恭輔
 */

public class Ex059 {
    public static void main(String[] args) {
        Robot rb1 = new Robot("EVA-01");
        rb1.showName();
        Robot.showCount();

        Robot rb2 = new Robot("AV-98");
        rb2.showName();
        Robot.showCount();
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
}
