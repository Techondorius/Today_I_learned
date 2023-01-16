/**
 *プログラム名       :   Ex046
 *引数1              :   なし
 *学籍番号           :   22JY0133
 *名前               :   藤田恭輔
 */

public class Ex046 {
    public static void main(String[] args) {
        Robot rb1 = new Robot("ガンダム", 60, 18);
        rb1.showName();
        rb1.showWeight();
        rb1.showHeight();
        Robot rb2 = new Robot(60, 18, "ガンダム");
        rb2.showName();
        rb2.showWeight();
        rb2.showHeight();
    }
}

class Robot {
    int weight;
    int height;
    String name;

    Robot(String name, int weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    Robot(int weight, int height, String name) {
        this(name, weight, height);
    }

    void showWeight() {
        System.out.printf("重さは%stonです\n", weight);
    }

    void showHeight(){
        System.out.printf("高さは%smです\n", height);
    }

    void showName(){
        System.out.printf("名前は%sです\n", name);
    }
}
