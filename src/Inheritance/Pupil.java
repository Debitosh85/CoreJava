package Inheritance;

public class Pupil {
  
  private int studentId;
  private String studentName;
  private int studentMarks;

  public Pupil(int studentId, String studentName, int studentMarks) {
    this.studentId = studentId;
    this.studentName = studentName;
    this.studentMarks = studentMarks;
  }

  public void setStudentId(int studentId) {
    this.studentId = studentId;
  }

  public int getStudentId() {
    return studentId;
  }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentMarks() {
        return studentMarks;
    }

    public void setStudentMarks(int studentMarks) {
        this.studentMarks = studentMarks;
    }

    @Override
    public String toString() {
      return "Pupil [studentId=" + studentId + ", studentName=" + studentName + ", studentMarks=" + studentMarks + "]";
    }
}
