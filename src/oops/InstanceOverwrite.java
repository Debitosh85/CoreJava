package oops;

public class InstanceOverwrite {

    int x;

    public InstanceOverwrite() {

        super();
        x = 590;
        System.out.println("The Value of x is:" + x);
    }

    {
        x = 190;
        System.out.println("X value is :" + x);
    }

}
