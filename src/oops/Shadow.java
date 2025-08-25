package oops;

public class Shadow {

    int id = 100;
    String name = "Ramesh";

    public void SetEmployee() {

        int id = 200;
        String name = "Smith";
        System.out.println("Shadow Value:" + id + "name is:" + name);
    }

    public void displayEmpInfo(int id, String name) {

        System.out.println("MId Value is:" + id);
        System.out.println("MName is :" + name);

    }

}
