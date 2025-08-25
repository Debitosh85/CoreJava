package oops;

public class ShadowMain {

    public static void main(String[] args) {
        Shadow s = new Shadow();
        System.out.println("Class Level Variable value:" + s.id + "name is:" + s.name);

        s.SetEmployee();
        s.displayEmpInfo(300, "Suresh");
    }

}
