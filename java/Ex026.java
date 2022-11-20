/**
 *プログラム名       :   Ex026
 *引数1              :   なし
 *学籍番号           :   22JY0133
 *名前               :   藤田恭輔
 */

import java.util.*;

class Ex026 {
    public static void main(String[] args) {

        int USER_NUM = 5;

        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int max = 0;
        int min = 100;

        System.out.printf("これから%s人のテストの成績を読み込みます。\n", USER_NUM);
        for (int i = 0; i < USER_NUM; i ++) {
            System.out.printf("%s人目\n", i + 1);

            int score = scan.nextInt();

            sum += score;
            if (score > max) {
                max = score;
            }
            if (score < min) {
                min = score;
            }
        }
        System.out.println("");

        double avg = (double) sum / USER_NUM;
        System.out.printf("最高点: %s\n", max);
        System.out.printf("最低点: %s\n", min);
        System.out.printf("平均点: %.2f\n", avg);


    }
}