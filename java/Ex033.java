/**
 *プログラム名       :   Ex033
 *引数1              :   なし
 *学籍番号           :   22JY0133
 *名前               :   藤田恭輔
 */

import java.util.*;

public class Ex033 {
    public static void main(String[] args){
        sumOf();
    }
    public static void sumOf(){
        Scanner scan = new Scanner(System.in);
        System.out.println("    整数を入力してください！");
        int input = 0;
        int sum = 0;
        while (input != -1) {
            input = scan.nextInt();
            if (input == -1) {
                // 何もしない
            } else {
                sum += input;
            }
        }
        System.out.printf("入力した整数の合計は%sです。\n", sum);
    }
}
