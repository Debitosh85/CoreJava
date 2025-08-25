package overload;

public class Demo {
    public Demo(int x, int y) {
        this(100, 200, 300);
        System.out.println("Values of x and y" + (x + y));
    }

    public Demo(String name) {
        this(100, 200);
        System.out.println("name is:" + name);
    }

    public Demo(int z, int m, int n) {

        System.out.println("Multiplication of the Values:" + (z * m * n));
    }

    public Demo() {
        this("Subham");
    }

}
