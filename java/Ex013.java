/**
 *プログラム名       :   Ex013
 *引数1              :   なし
 *学籍番号           :   22JY0133
 *名前               :   藤田恭輔
 */

import java.util.*;

public class Ex013 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x,y;
        System.out.print("x を入力してください:");
        x = scan.nextInt();
        System.out.print("y を入力してください:");
        y = scan.nextInt();

        int sum, dist, times;
        sum = x + y;
        dist = x - y;
        times = x * y;

        System.out.printf("x + y = %d\n", sum);
        System.out.printf("x - y = %d\n", dist);
        System.out.printf("x * y = %d\n", times);
    }
}
