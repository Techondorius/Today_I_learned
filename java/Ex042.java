/**
 *プログラム名       :   Ex042
 *引数1              :   なし
 *学籍番号           :   22JY0133
 *名前               :   藤田恭輔
 */


public class Ex042 {
    public static void main(String[] args) {
        Car c = new Car();

        System.out.println("run(char dir, int spd) method");
        char dir = '西';
        int spd = 50;
        c.run(dir, spd);
        c.print();

        System.out.println();


        System.out.println("turn(char dir) method");
        dir = '北';
        c.turn(dir);
        c.print();

        System.out.println();


        System.out.println("stop() method");
        c.stop();
        c.print();

        System.out.println();


        System.out.println("run(char dir, int spd) method");
        dir = '東';
        spd = 100;
        c.run(dir, spd);
        c.print();

        System.out.println();


        System.out.println("stop() method");
        c.stop();
        c.print();

        
    }
    
}

class Car {
    int gasoline = 50;
    char direction;
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
