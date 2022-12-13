/**
 *プログラム名       :   Ex031
 *引数1              :   なし
 *学籍番号           :   22JY0133
 *名前               :   藤田恭輔
 */

import java.util.Scanner;
class Ex031{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.println("点数を入力してください!");
        int ten = stdIn.nextInt();
        assess(ten);
    }

    public static void assess(int num) {
        String msg;
        if (num >= 80) {
            msg = "大変よくできました";
        } else if (num >=60) {
            msg = "よくできました";
        } else {
            msg = "がんばりましょう";
        }
        System.out.println(msg);
    }

}