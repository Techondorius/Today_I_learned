/**
 *プログラム名       :   Ex010
 *引数1              :   なし
 *学籍番号           :   22JY0133
 *名前               :   藤田恭輔
 */

public class Ex010 {
    public static void main(String[] args){
        // 表示する"V"の高さ
        int height = 100;

        for (int i = 0; i < height; i ++) {
            for (int j = 0; j < i; j ++) {
                System.out.print(" ");
            }

            System.out.print("*");

            // スペースの個数が上段から5, 3, 1, 0なのでその回数表示するようにする
            for (int k = 0; k < 2 * (height - i - 1) - 1; k ++) {
                System.out.print(" ");
            }

            if (i != height - 1) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
