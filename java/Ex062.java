/**
 *プログラム名       :   Ex062
 *引数1              :   なし
 *学籍番号           :   22JY0133
 *名前               :   藤田恭輔
 */

 public class Ex062 {
    public static void main(String[] args) {
        PlasticBottle[] pbs = new PlasticBottle[50];
        for (int i = 0; i < pbs.length; i ++) {
            pbs[i] = new PlasticBottle(500, (int)(Math.random()* 500));
        }

        for (PlasticBottle pb: pbs) {
            if (pb.nokori >= 400) {
                pb.show();
            }
        }
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
