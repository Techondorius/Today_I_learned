/**
 *プログラム名       :   Ex041
 *引数1              :   なし
 *学籍番号           :   22JY0133
 *名前               :   藤田恭輔
 */

public class Ex041 {
    public static void main(String[] args) {
        PlasticBottle pb1 = new PlasticBottle();
        pb1.show();

        PlasticBottle pb2 = new PlasticBottle(1000);
        pb2.show();

        PlasticBottle pb3 = new PlasticBottle(350, 200);
        pb3.show();
    }
}

class PlasticBottle {
    int size;
    int nokori;

    PlasticBottle() {
        this(500, 500);
    }

    PlasticBottle(int size) {
        this(size, 0);
    }

    PlasticBottle(int size, int nokori) {
        this.size = size;
        this.nokori = nokori;
    }

    void show() {
        System.out.printf("サイズは%sml、残りは%sml です\n", size, nokori);
    }

}
