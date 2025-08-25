package oops;

public class InstanceBlo {

    public InstanceBlo() {

        this(100, "Debitosh"); // due to this() Compiler Will not add instance Block in Second Line

        System.out.println("No Parametrized");
    }

    public InstanceBlo(int id, String name) {

        System.out.println("Parametrized Constructor" + id + "\t" + name);
    }

    {
        System.out.println("Non Static Block");
    }

}
