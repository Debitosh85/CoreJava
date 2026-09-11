package Edu.multithread;

public class EducationInstitute {

  private Course[] course;
  private Offer[] offer;

  public EducationInstitute(Course[] course, Offer[] offer) {
    this.course = course;
    this.offer = offer;
  }

  public Course[] getCourse() {
    return course;
  }

  public Offer[] getOffer() {
    return offer;
  }
  public void enrollStudentCourse(int courseId, String studentName) {
    for (int i =0;i<=course.length; i++) {
      if (courseId==course[i].getId()) {
        System.out.println(studentName+"With id:"+courseId+"enrolled for the course..👍"+course[i].getName());
      } else {
        System.out.println(courseId+"Not found");
      }
    }
  }
}
