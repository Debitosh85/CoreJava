package oops;

public class EmpReq {

    int empId;
    String empName;
    double employeeSalary;
    char empGrade;

    public void setEmployee(int id, String name, double salary) {
        empId = id;
        empName = name;
        employeeSalary = salary;
    }
    public void calculateEmployee() {

        if (employeeSalary >= 90000) {
            System.out.println(empGrade = 'A');
        } else if (employeeSalary >= 80000) {
            System.out.println(empGrade = 'B');
        } else if (employeeSalary >= 70000) {
            System.out.println(empGrade = 'C');
        } else {
            System.out.println("Please enter Valid amount");
        }
    }

    public void displayEmployeeInfo() {
        System.out.println("EmpId is :" + empId);
        System.out.println("EmpName is :" + empName);
        System.out.println("Employee Salary is:" + employeeSalary);
        System.out.println("Employee Grade:" + empGrade);
    }

}
