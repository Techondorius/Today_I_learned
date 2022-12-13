/**
 *プログラム名       :   Ex043
 *引数1              :   なし
 *学籍番号           :   22JY0133
 *名前               :   藤田恭輔
 */

 public class Ex043 {
    public static void main(String[] args){
        Car3 car3 = new Car3();
        car3.print();
        car3.run('西', 50);
        car3.print();
        car3.turn('北');
        car3.print();
        car3.run('南', 60);
        car3.print();
        car3.stop();
        car3.print();
    }
}

class Car3 {
    int gasoline = 50;
    char direction = '北';
    int speed;

    void run(char dir, int spd) {
        this.gasoline -= 1;
        this.direction = dir;
        this.speed = spd;
    }

    void turn(char dir) {
        this.direction = dir;
        this.gasoline -= 1;
    }

    void stop() {
        this.speed = 0;
    }

    void print() {
        System.out.printf("ガソリン　:%s Liter\n", this.gasoline);
        System.out.printf("方向　　　:%s\n", this.direction);
        System.out.printf("スピード　:%skm/h\n", this.speed);
    }
}

