/**
 *プログラム名       :   Ex011
 *引数1              :   なし
 *学籍番号           :   22JY0133
 *名前               :   藤田恭輔
 */

public class Ex011 {
    public static void main(String[] args){
        // 表示する"X"の高さ
        int height = 7;
        int v_height = height / 2 + 1;

        for (int i = 0; i < v_height; i ++) {
            for (int j = 0; j < i; j ++) {
                System.out.print(" ");
            }

            System.out.print("*");

            // スペースの個数が上段から5, 3, 1, 0なのでその回数表示するようにする
            for (int k = 0; k < 2 * (v_height - i - 1) - 1; k ++) {
                System.out.print(" ");
            }

            if (i != v_height - 1) {
                System.out.print("*");
            }

            System.out.println("");
        }

        for (int i = 1; i < v_height; i ++) {
            for (int j = v_height-1; j > i; j --) {
                System.out.print(" ");
            }

            System.out.print("*");

            // スペースの個数が1, 3, 5なのでその回数をループするfor
            for (int k = 1; k < i * 2; k ++) {
                System.out.print(" ");
            }

            System.out.print("*");

            System.out.println("");
        }
    }
}
