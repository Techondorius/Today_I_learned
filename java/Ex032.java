/**
 *プログラム名       :   Ex032
 *引数1              :   なし
 *学籍番号           :   22JY0133
 *名前               :   藤田恭輔
 */

public class Ex032 {
    public static void main(String[] args) {
        int height1 = 180;
        int height2 = 160;
        int height3 = 140;
        System.out.println("1人目のサイズは" + selectSize(height1) + "です");
        System.out.println("2人目のサイズは" + selectSize(height2) + "です");
        System.out.println("3人目のサイズは" + selectSize(height3) + "です");
    }

    public static char selectSize(int height) {
        if (height >= 170) {
            return 'L';
        } else if (height >= 150) {
            return 'M';
        } else {
            return 'S';
        }
    }
}
