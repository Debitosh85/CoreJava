package Inheritance;

class Parent {

    private int x, y;

    public void setDate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getx() {
        return x;
    }

    public int gety() {
        return y;
    }

}

class Sub extends Parent {

    public void showDetails() {
        System.out.println("The Value of x from Super:" + getx());
        System.out.println("The Value of y from Super:" + gety());

    }

}

public class SingleLevelDemo {
    public static void main(String[] args) {

        Sub s = new Sub();
        s.setDate(10, 20);
        s.showDetails();
    }
}
