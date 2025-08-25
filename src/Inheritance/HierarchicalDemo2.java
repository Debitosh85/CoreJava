package Inheritance;

class Employee {

    protected double balance;

    public Employee(double balance) {
        super();
        this.balance = balance;
    }

}

class Devloper extends Employee {

    public Devloper(double balance) {

        super(balance);
    }

    @Override
    public String toString() {

        return "Devloper[balance=" + balance + "]";
    }

}

class Designer extends Employee {

    public Designer(double balance) {

        super(balance);
    }

    @Override
    public String toString() {

        return "Designer[balance=" + balance + "]";

    }

}

public class HierarchicalDemo2 {

    public static void main(String[] args) {
        Designer d = new Designer(1000);
        System.out.println(d);

        Devloper s = new Devloper(45000);
        System.out.println(s);
    }

}
