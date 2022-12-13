/**
 *プログラム名       :   Ex034
 *引数1              :   なし
 *学籍番号           :   22JY0133
 *名前               :   藤田恭輔
 */

import java.util.*;

public class Ex035 {
    public static void main(String[] args){
        int USER_NUM = 5;

        Scanner scan = new Scanner(System.in);
        int[] scores = new int[USER_NUM];

        System.out.printf("これから%s人のテストの成績を読み込みます。\n", USER_NUM);
        for (int i = 0; i < USER_NUM; i ++) {
            System.out.printf("%s人目\n", i + 1);

            int score = scan.nextInt();
            scores[i] = score;
        }
        System.out.println("");

        int max = getMax(scores);
        int min = getMin(scores);
        double ave = getAve(scores);

        System.out.printf("最高点: %s\n", max);
        System.out.printf("最低点: %s\n", min);
        System.out.printf("平均点: %.2f\n", ave);

    }

    public static int getMax(int[] scores) {
        int max = 0;
        for (int i = 0; i < scores.length; i ++) {
            int score = scores[i];
            if (score > max) {
                max = score;
            }
        }
        return max;
    }

    public static int getMin(int[] scores) {
        int min = 100;
        for (int i = 0; i < scores.length; i ++) {
            int score = scores[i];
            if (score < min) {
                min = score;
            }
        }
        return min;
    }

    public static double getAve(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i ++) {
            int score = scores[i];
            sum += score;
        }
        double ave = (double) sum / scores.length;
        return ave;
    }
}
