package Inheritance;

class Father {

    public void house() {
        System.out.println("Father have a house acquired by Son");
    }

}

class Son extends Father {

    public void car() {
        System.out.println("Son have car");
    }
}

public class SingleLevel {

    public static void main(String[] args) {

        Son s = new Son();
        s.house();
        s.car();

    }

}
