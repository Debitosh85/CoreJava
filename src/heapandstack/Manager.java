package heapandstack;

public class Manager {

    private Integer mId;
    private String mName;

    public Manager(Employee emp) {
        this.mId = emp.getEmpId();
        this.mName = emp.getEmpName();
    }

    @Override
    public String toString() {
        return "manager[mid=" + mId + ",mName=" + mName + "]";
    }

}
