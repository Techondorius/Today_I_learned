/**
 *プログラム名       :   Ex050
 *引数1              :   なし
 *学籍番号           :   22JY0133
 *名前               :   藤田恭輔
 */

 class Ex050{
    public static void main(String[] args){
        Person p1 = new Person();
        p1.setData("Ishida", 'M', 170.5, 60.0);
        p1.printData();
        Person p2 = new Person();
        p2.setData("Tanaka", 'F');
        p2.printData();
        Person p3 = new Person();
        p3.setData();
        p3.printData();
    }
}

class Person {
    String name;
    char sex;
    double height;
    double weight;

    Person() {}

    void setData(String name, char sex, double height, double weight) {
        this.setData(name, sex);
        this.height = height;
        this.weight = weight;
    }

    void setData(String name, char sex) {
        this.name = name;
        this.sex = sex;
    }

    void setData() {
        this.setData("名無しのごんべい", '?', 0, 0);
    }

    void printData() {
        System.out.printf("%s(%s): %scm, %skg\n", name, sex, height, weight);
    }
}
