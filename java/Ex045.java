/**
 *プログラム名       :   Ex045
 *引数1              :   なし
 *学籍番号           :   22JY0133
 *名前               :   藤田恭輔
 */

class Ex045 {
    public static void main(String[] args) {
        Food f1 = new Food("たいやき", 100);
        f1.printPrice();
        f1.printPrice(3);
    }
}

class Food {
    String name;
    int price;

    Food(String name, int price) {
        this.name = name;
        this.price = price;
    }

    void printPrice() {
        this.printPrice(1);
    }

    void printPrice(int amount) {
        System.out.printf("%sは%s個%s円です\n", name, amount, price*amount);
    }
}
