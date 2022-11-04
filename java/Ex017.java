/**
 *プログラム名       :   Ex017
 *引数1              :   なし
 *学籍番号           :   22JY0133
 *名前               :   藤田恭輔
 */

import java.util.*;

public class Ex017 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("入力する整数の合計を求めます");

        System.out.println("数を入力してください(ただし合計が1000を超えたら終了します。)");
        int times = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < times; i ++){
            int input;
            System.out.print("整数を入力してください: ");
            input = scan.nextInt();
            if (sum + input <= 1000) {
                sum += input;
            } else {
                System.out.println("合計が1000を超えたので終了します");
                break;
            }
            System.out.println("");
        }
        System.out.printf("合計は%dです\n", sum);
    }
}
