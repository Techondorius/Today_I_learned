/**
 *プログラム名       :   Ex037
 *引数1              :   なし
 *学籍番号           :   22JY0133
 *名前               :   藤田恭輔
 */

import java.util.Scanner;
public class Ex037 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("購入個数を入力してください");
        int amount = scan.nextInt();
        System.out.println("価格を入力してください");
        int price = scan.nextInt();
        int summary;

        if (amount >= 500) {
            summary = (int) (amount * price * 0.8);
        } else {
            summary = amount * price;
        }

        System.out.printf("定価%s円の商品を%s個購入する場合%s円です。\n", price, amount, summary);
    }
}
