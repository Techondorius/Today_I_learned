/**
 *プログラム名       :   Ex044
 *引数1              :   なし
 *学籍番号           :   22JY0133
 *名前               :   藤田恭輔
 */


public class Ex044 {
    public static void main(String[] args) {
        Rocket r1 = new Rocket();
        System.out.printf("総重量は%sです。\n", r1.calcTotal());

        Rocket r2 = new Rocket(3, 7, 1);
        System.out.printf("総重量は%sです。\n", r2.calcTotal());
        
        Rocket r3 = new Rocket(3, 7, 1, 9, 2, 4);
        System.out.printf("総重量は%sです。\n", r3.calcTotal());
    }
}

class Rocket {
    int parts1, parts2, parts3, parts4, parts5, parts6;

    Rocket() {
        this.parts1 = 0;
        this.parts2 = 0;
        this.parts3 = 0;
        this.parts4 = 0;
        this.parts5 = 0;
        this.parts6 = 0;
    }

    Rocket(int p1, int p2, int p3) {
        this.parts1 = p1;
        this.parts2 = p2;
        this.parts3 = p3;
        this.parts4 = 0;
        this.parts5 = 0;
        this.parts6 = 0;
        
    }

    Rocket(int p1, int p2, int p3, int p4, int p5, int p6) {
        this.parts1 = p1;
        this.parts2 = p2;
        this.parts3 = p3;
        this.parts4 = p4;
        this.parts5 = p5;
        this.parts6 = p6;
    }

    int calcTotal() {
        return this.parts1 + this.parts2 + this.parts3 + this.parts4 + this.parts5 + this.parts6;
    }
}
