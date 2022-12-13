/**
 *プログラム名       :   Ex040
 *引数1              :   なし
 *学籍番号           :   22JY0133
 *名前               :   藤田恭輔
 */

class Ex040 {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.width = 7;
        sq.height = 3;

        int width = sq.getWidth();
        int height = sq.getHeight();
        int area = sq.getArea();
        System.out.printf("横幅は%s、高さは%s、面積は%sです\n", width, height, area);
    }
}

class Square{
    //ここにフィールド、メソッドを定義
    int width;
    int height;

    int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public int getArea() {
        int area = this.width * this.height;
        return area;
    }
}

