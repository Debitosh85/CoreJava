package heapandstack;

public class Employee {

    private Integer empId;
    private String empName;

    public Employee(Integer id, String name) {
        this.empId = id;
        this.empName = name;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer id) {
        this.empId = id;
    }

    public String getEmpName() {
        return empName;
    }

    @Override
    public String toString() {
        return "Employee[empId=" + empId + ",empName=" + empName + "]";
    }

}
