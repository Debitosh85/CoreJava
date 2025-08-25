
public class Employee {

    int employeeId;
    String empName;
    String empAddress;
    double empSalary;

    public void EmpInfo(int id, String name, String address, double salary) {

        employeeId = id;
        empName = name;
        empAddress = address;
        empSalary = salary;

    }

    public void disPlayEmployeeInformation() {

        System.out.println("Id is :" + employeeId);
        System.out.println("EmpName is:" + empName);
        System.out.println("Address is :" + empAddress);
        System.out.println("Salary is :" + empSalary);

    }

}
