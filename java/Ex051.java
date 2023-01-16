/**
 *プログラム名       :   Ex051
 *引数1              :   なし
 *学籍番号           :   22JY0133
 *名前               :   藤田恭輔
 */

 class Ex051{
    public static void main(String[] args){
        Person p1 = new Person();
        p1.setData("Ishida", 'M', 170.5, 60.0);
        printData(p1);
        Person p2 = new Person();
        p2.setData("Tanaka", 'F');
        printData(p2);
        Person p3 = new Person();
        p3.setData();
        printData(p3);
    }

    static void printData(Person person){
        System.out.printf("%s(%s): %scm, %skg\n", person.name, person.sex, person.height, person.weight);
    }
}

class Person {
    String name = "名無しのごんべい";
    char sex = '?';
    double height = 0;
    double weight = 0;

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

    void setData() {}

    void printData() {
        System.out.printf("%s(%s): %scm, %skg\n", name, sex, height, weight);
    }
}
