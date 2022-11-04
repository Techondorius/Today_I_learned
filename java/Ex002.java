/**
 *プログラム名       :   Ex002
 *引数1              :   なし
 *学籍番号           :   22JY0133
 *名前               :   藤田恭輔
 */

public class Ex002 {
    public static void main(String[] args){
        float r, pi, area;
        r = 5.5F;
        pi = 3.14F;
        area = r * r * pi;
        System.out.printf("半径%.1f 円周率%.2fの円の面積は%.3fです\n", r, pi, area);
    }
}
