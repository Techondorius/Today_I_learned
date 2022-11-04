/**
 *プログラム名       :   Ex003
 *引数1              :   なし
 *学籍番号           :   22JY0133
 *名前               :   藤田恭輔
 */

public class Ex003 {
    public static void main(String[] args){
        int i1, i2, sum, dist, times,div, mod1, mod2;

        i1 = 23;
        i2 = 4;
        sum = i2 + i1;
        dist = i2 - i1;
        times = i2 * i1;
        div = i2 / i1;
        mod1 = i2 - div * i1;
        mod2 = i2 % i1;

        System.out.printf("%d + %d = %d\n", i2, i1, sum);
        System.out.printf("%d + %d = %d\n", i2, i1, dist);
        System.out.printf("%d + %d = %d\n", i2, i1, times);
        System.out.printf("%d + %d = %d\n", i2, i1, div);
        System.out.printf("%d + %d = %d(余りの演算子不使用)\n", i2, i1, mod1);
        System.out.printf("%d + %d = %d(余りの演算子使用)\n", i2, i1, mod2);
    }

}
