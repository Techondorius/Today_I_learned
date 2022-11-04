/**
 *プログラム名       :   Ex014
 *引数1              :   なし
 *学籍番号           :   22JY0133
 *名前               :   藤田恭輔
 */

import java.util.*;

public class Ex014 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("\"*\"を表示する回数を入力してください");
        int t = scan.nextInt();

        if (t < 1) {
            System.out.println("次回からは1以上の数字を入力してくださいね！");
        } else {
            for (int i = 0; i < t; i ++) {
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}
