package oops;

public class EpmreqMain {

    public static void main(String[] args) {

        EmpReq e = new EmpReq();

        e.setEmployee(111, "Suresh", 90000);
        e.calculateEmployee();
        e.displayEmployeeInfo();

        System.out.println("=====================================");

        e.setEmployee(222, "Badal", 70000);
        e.calculateEmployee();
        e.displayEmployeeInfo();

    }

}
