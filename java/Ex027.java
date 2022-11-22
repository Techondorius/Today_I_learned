/**
 *プログラム名       :   Ex027
 *引数1              :   なし
 *学籍番号           :   22JY0133
 *名前               :   藤田恭輔
 */

public class Ex027 {
    public static void main(String[] args) {
        int[] data1 = new int[]{11, 22, 33};
        int[] data2 = new int[data1.length];
        //配列のコピー
        for (int i = 0; i < data1.length; i++) {
            data2[i] = data1[i];
        }
        //data2 の値の書き換え
        data2[0] = 10;
        data2[1] = 20;
        //data1,2 の内容表示
        System.out.print("data1:");
        printAry(data1);
        System.out.print("data2:");
        printAry(data2);
    }

    static void printAry(int[] ary){
        for(int data : ary){
            System.out.print(data + " ");
        }
        System.out.println();
    }
}
