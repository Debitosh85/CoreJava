package test;

public class Test2 {

    int empId;
    String empName;
    String empAdress;
    double empSalary;

    public void setEmpDetails(int Id, String Name, String Adress, double Salary) {
        empId = Id;
        empName = Name;
        empAdress = Adress;
        empSalary = Salary;
    }

    public void getempDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Adress: " + empAdress);
        System.out.println("Employee Salary: " + empSalary);
    }

    public String toString() {
        return "Employee ID: " + empId + "\nEmployee Name: " + empName + "\nEmployee Adress: " + empAdress
                + "\nEmployee Salary: " + empSalary;
    }
}
