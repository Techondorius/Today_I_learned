/**
 *プログラム名       :   Ex008
 *引数1              :   なし
 *学籍番号           :   22JY0133
 *名前               :   藤田恭輔
 */

public class Ex008 {
    public static void main(String[] args){
        for (int i = 0; i < 8; i ++) {
            for (int j = 0; j < i + 1; j ++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
