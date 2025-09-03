package Inheritance;

// Person1.java code
class Person1 {
  private String name;
  private int age;

  public Person1(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() { return name; }
  public int getAge() { return age; }

  @Override
  public String toString() {
    return "Person1 [name=" + name + ", age=" + age + "]";
  }
}

// Employee.java code
class Employee extends Person1 {
  private double salary;

  public Employee(String name, int age, double salary) {
    super(name, age);
    this.salary = salary;
  }

  public double getSalary() { return salary; }

  @Override
  public String toString() {
    return "Employee [salary=" + salary + ", name=" + getName() + ", age=" + getAge() + "]";
  }
}

// Manager.java code
public class Manager extends Employee {
  private double bonus;

  public Manager(String name, int age, double salary, double bonus) {
    super(name, age, salary);
    this.bonus = bonus;
  }

  public double getBonus() { return bonus; }

  public void getTotalSalary() {
    if (getSalary() < 0) {
      throw new IllegalArgumentException("Salary can't be Negative");
    } else {
      System.out.println("Total Salary of Employee: " + (getSalary() + bonus));
    }
  }

  @Override
  public String toString() {
    return "Manager [bonus=" + bonus + ", name=" + getName() + ", age=" + getAge() +
           ", salary=" + getSalary() + "]";
  }
}
