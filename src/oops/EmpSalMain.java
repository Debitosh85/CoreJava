package oops;

public class EmpSalMain {

    public static void main(String[] args) {

        EmpSal e = new EmpSal(50000.00);
        System.out.println(e);

        System.out.println("After one Year Modifying the Salary");

        e.setEmpSal(e.getEmpSal() + 1000);
        System.out.println(e);

    }

}
