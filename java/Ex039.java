/**
 *プログラム名       :   Ex039
 *引数1              :   なし
 *学籍番号           :   22JY0133
 *名前               :   藤田恭輔
 */


class Ex039 {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.width = 7;
        sq.height = 3;
        sq.showWidth();
        sq.showHeight();
        sq.showArea();
    }
}
class Square{
    //ここにフィールド、メソッドを定義
    int width;
    int height;

    public void showWidth() {
        System.out.printf("横幅は%sです。\n", width);
    }

    public void showHeight() {
        System.out.printf("高さは%sです。\n", height);
    }

    public void showArea() {
        System.out.printf("面積は%sです。\n", width * height);
    }
}
