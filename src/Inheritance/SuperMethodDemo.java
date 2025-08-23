package Inheritance;

/* class Parent {

    public String toString() {

        return "India";
    }
}

class Child extends Parent {

    public String toString() {

        System.out.println("Parent Value:" + super.toString());

        return "Hydrabad";

    }

}

public class SuperMethodDemo {

    public static void main(String[] args) {

        Child c = new Child();
        System.out.println("child Value:" + c.toString());
    }
}
 */

class Super {
    Super() {
        super();
        System.out.println("Alpha class");
    }
}

class Sub extends Super {

    Sub() {
        super();
        System.out.println("Beta Class");
    }
}

public class SuperMethodDemo {
    public static void main(String[] args) {

        Sub s = new Sub();
    }
}
