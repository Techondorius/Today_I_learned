/**
 *プログラム名       :   Ex019
 *引数1              :   なし
 *学籍番号           :   22JY0133
 *名前               :   藤田恭輔
 */

import java.util.*;

public class Ex019 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("西暦を入力してください！");
        int year = scan.nextInt();

        String zodiac = "";

        switch (year % 12) {
            case 0:
            zodiac = "申";
            break;
            case 1:
            zodiac = "酉";
            break;
            case 2:
            zodiac = "戌";
            break;
            case 3:
            zodiac = "亥";
            break;
            case 4:
            zodiac = "子";
            break;
            case 5:
            zodiac = "丑";
            break;
            case 6:
            zodiac = "寅";
            break;
            case 7:
            zodiac = "卯";
            break;
            case 8:
            zodiac = "辰";
            break;
            case 9:
            zodiac = "巳";
            break;
            case 10:
            zodiac = "午";
            break;
            case 11:
            zodiac = "未";
            break;
        }
        System.out.printf("%d年は%s年です！\n", year, zodiac);
        scan.close();

    }
}
