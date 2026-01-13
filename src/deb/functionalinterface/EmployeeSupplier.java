package deb.functionalinterface;

import java.util.function.*;
class Employee {

  int empId;
  String empName;
  double empSalary;

  public Employee(int empId, String empName, double empSalary) {
    super();
    this.empId = empId;
    this.empName = empName;
    this.empSalary = empSalary;
  }
  
  @Override
  public String toString() {
    return "Employee[empId="+empId+",empName="+empName+",empSalary="+empSalary+"]";
  }
}
public class EmployeeSupplier {
  public static void main(String[] args) {
    /* Supplier<Employee> e = () -> new Employee(111, "Debitosh", 20000);
    Employee e1 = e.get();
    System.out.println(e1); */

    Supplier<Employee> s = new Supplier(){
      @Override
      public Employee get(){
        return new Employee(111, "Debitosh", 2000);
      }
    };
    Employee e = s.get();
    System.out.println(e);
}
}
