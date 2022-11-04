/**
 *プログラム名       :   Ex012
 *引数1              :   なし
 *学籍番号           :   22JY0133
 *名前               :   藤田恭輔
 */

public class Ex012 {
    public static void main(String[] args){
        for (int i = 1; i <= 9; i ++) {
            for (int j = 1; j <= 9; j ++) {
                System.out.print(" ");
                int x = i * j;
                if (x < 10) {
                    System.out.print(" ");
                }
                System.out.print(x);
            }
            System.out.println("");
        }
    }
}
