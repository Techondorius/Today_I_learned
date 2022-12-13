public class Test {
    public static void main(String[] args) {
        System.out.println("hello");
        CCar c = new CCar();
        c.setCC(1000);
        System.out.println(c.getCar());
    }
}

class Car {
    private int cc = 0;

    public void setCC(int cc) {
        this.cc =  cc;
    }

    public int getCar() {
        return this.cc;
    }
}

class CCar extends Car {
    public void setCCC(int c) {
        // this.cc = c;
    }
}
