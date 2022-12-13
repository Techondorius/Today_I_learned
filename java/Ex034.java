/**
 *プログラム名       :   Ex034
 *引数1              :   なし
 *学籍番号           :   22JY0133
 *名前               :   藤田恭輔
 */

public class Ex034 {
    public static void main(String[] args){
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        System.out.printf("a: %s, b: %s, max: %s\n", a, b, maxValue(a, b));
    }

    public static int maxValue(int a, int b) {
        if (a < b) {
            return b;
        } else {
            return a;
        }
    }
}
