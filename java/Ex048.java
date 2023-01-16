/**
 *プログラム名       :   Ex048
 *引数1              :   なし
 *学籍番号           :   22JY0133
 *名前               :   藤田恭輔
 */

 public class Ex048 {
    public static void main(String[] args) {
        Robot rb1 = new Robot("ガンダム", 60.0, 18.0);
        rb1.showSpec();
        Robot rb2 = new Robot("ASIMO", 0.23, 1.8);
        rb2.showSpec();
        Robot rb3 = new Robot("ロボコン", 1, 1.5);
        rb3.showSpec();
    }
}

class Robot {
    double weight;
    double height;
    String name;

    Robot(String name, double weight, double height) {
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

    void showSpec(){
        System.out.printf("%s (%ston, %sm)\n", name, weight, height);
    }
}
