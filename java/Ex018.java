/**
 *プログラム名       :   Ex018
 *引数1              :   なし
 *学籍番号           :   22JY0133
 *名前               :   藤田恭輔
 */

import java.util.*;

public class Ex018 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("\"○\"\"●\"を表示する回数を入力してください");
        int times = scan.nextInt();

        if (times < 1) {
            System.out.println("次回からは1以上の数字を入力してくださいね！");
        } else {
            for (int i = 0; i < times; i ++) {
                if (i % 2 == 0) {
                    System.out.print("●");
                } else {
                    System.out.print("○");
                }
            }
            System.out.println("");
        }
    }
}
