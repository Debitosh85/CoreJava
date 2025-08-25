package oops;

public class Scopy {

    private String studentName;
    private int studentAge;

    public Scopy(String name,int age){
        this.studentName = name;
        this.studentAge = age;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    @Override
    public String toString() {
        return "Scopy [studentName=" + studentName + ", studentAge=" + studentAge + "]";
    }

    


}
