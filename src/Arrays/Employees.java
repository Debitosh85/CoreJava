package Arrays;

public class Employees {

  int id;
  String Name;
  double salary;

  public Employees(int id, String Name, double salary) {
    this.id = id;
    this.Name = Name;
    this.salary = salary;
  }

  public Employees() {
    
  }
  
  public Employees[] getAllEmployees() {
    Employees[] e = new Employees[5];
    e[0] = new Employees(111, "Subahm", 10000);
    e[1] = new Employees(222, "Sukesh", 300000);
    e[2] = new Employees(333, "Rahul", 400000);
    e[3] = new Employees(444, "Durnay", 50000);
    e[4] = new Employees(555, "Mohan", 8000000);
    for (Employees s : e) {
      System.out.println(s.id);
      System.out.println(s.Name);
      System.out.println(s.salary);
    }
    return e;
  }
  public static void main(String[] args) {
      
    Employees a = new Employees();
    a.getAllEmployees();
  }

}
