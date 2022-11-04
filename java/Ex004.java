/**
 *プログラム名       :   Ex004
 *引数1              :   なし
 *学籍番号           :   22JY0133
 *名前               :   藤田恭輔
 */

public class Ex004 {
    public static void main(String[] args){
        double student, goodstudent;
        student = 48;
        goodstudent = 3;

        double f = goodstudent / student * 100;

        System.out.printf("クラス人数%.0f人の中で出席率が100%%の学生%.0f人は全体の%.2fです!\n", student, goodstudent, f);
    }

}
