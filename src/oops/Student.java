package oops;

public class Student {

    private String studentName;
    private int studentId;
    private double stHeight;
    private String studentAddress;


    public Student(String name,int Id,double height,String address){
        this.studentName = name;
        this.studentId =Id;
        this.stHeight= height;
        this.studentAddress = address;
    }

    public void setStudentName(String name){
        this.studentName = name;
    }

    public String getStudentName(){
        return this.studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double getStHeight() {
        return stHeight;
    }

    public void setStHeight(double stHeight) {
        this.stHeight = stHeight;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "Student [studentName=" + studentName + ", studentId=" + studentId + ", stHeight=" + stHeight
                + ", studentAddress=" + studentAddress + "]";
    }

    
}
