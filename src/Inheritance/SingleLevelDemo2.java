package Inheritance;

class TemporaryEmployee {

    protected int empId;
    protected String empName;
    protected String empAddress;

    TemporaryEmployee(int empId, String empName, String empAddress) {

        super();
        this.empId = empId;
        this.empName = empName;
        this.empAddress = empAddress;
    }
}

class PermananentEmployee extends TemporaryEmployee {
    protected String departmentName;
    protected String desigNation;

    PermananentEmployee(int empId, String empName, String empAddress, String departmentName, String desigNation) {

        super(empId, empName, empAddress);
        this.departmentName = departmentName;
        this.desigNation = desigNation;
    }

    @Override
    public String toString() {
        return "PermananentEmployee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress
                + ", departmentName=" + departmentName + ", desigNation=" + desigNation + "]";
    }

}

public class SingleLevelDemo2 {

    public static void main(String[] args) {

        PermananentEmployee p = new PermananentEmployee(111, "Debitosh", "Odisha", "IT", "Devloper");

        System.out.println(p);

    }

}
