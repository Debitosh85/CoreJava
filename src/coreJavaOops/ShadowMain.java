package coreJavaOops;

class Shadowing {

    int id = 100;
    String name = "John";

    public void accept() {

        id = 200;
        name = "Smith";

        System.out.println("pupil name is:" + name + "pupil id is :" + id);
    }

    public void get(int id, String name) {
        System.out.println("Id is:" + id + "name is:" + name);
    }

}

public class ShadowMain {

    public static void main(String[] args) {

        Shadowing s1 = new Shadowing();
        s1.accept();
        s1.get(101, "ward");

    }

}
