/**
 *プログラム名       :   Ex036
 *引数1              :   なし
 *学籍番号           :   22JY0133
 *名前               :   藤田恭輔
 */

import java.util.Scanner;
class Ex036{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("学生の人数を入力してください!");
        int student = scan.nextInt();
        System.out.println("出席率が 100%の学生の人数を入力してください");
        int goodStudent = scan.nextInt();
        double rate = rateCalculate(student, goodStudent);
        System.out.println("出席率が 100%の学生は全体の" + rate +"%です");
        scan.close();
    }

    public static double rateCalculate(int student, int goodStudent) {
        double rate = (double)goodStudent / (double)student * 100;
        int rate_rounded = (int)(rate * 10);
        return (double) rate;
    }
}
