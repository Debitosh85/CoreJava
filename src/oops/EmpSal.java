package oops;

public class EmpSal {

    private double empSal;

    public EmpSal(double empSal) {
        this.empSal = empSal;
    }

    public void setEmpSal(double empSal) {

        this.empSal = empSal;

    }

    public double getEmpSal() {
        return this.empSal = empSal;
    }

    @Override
    public String toString() {

        return "EmpSal[empSal=" + empSal + "]";
    }

}
