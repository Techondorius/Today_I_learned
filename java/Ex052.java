/**
 *プログラム名       :   Ex052
 *引数1              :   なし
 *学籍番号           :   22JY0133
 *名前               :   藤田恭輔
 */

 class Ex052{
    public static void main(String[] args){
        Person p1 = new Person("Ishida", 'M', 170.5, 60.0);
        p1.printData();
        Person p2 = new Person("Tanaka", 'F');
        p2.printData();
        Person p3 = new Person();
        p3.printData();
    }
}

class Person {
    String name = "名無しのごんべい";
    char sex = '?';
    double height = 0;
    double weight = 0;

    Person(String name, char sex, double height, double weight) {
        this.name = name;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
    }

    Person(String name, char sex) {
        this.name = name;
        this.sex = sex;
    }

    Person() {}

    void printData() {
        System.out.printf("%s(%s): %scm, %skg\n", name, sex, height, weight);
    }
}
