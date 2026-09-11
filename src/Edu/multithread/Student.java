package Edu.multithread;

public class Student {

  String stuName;
  EducationInstitute institute;

  public Student(String stuName, EducationInstitute institute) {
    this.stuName = stuName;
    this.institute = institute;
  }

 public void viewCoursesAndFees(){
   System.out.println("Available Courses are:");
   Course[] c = institute.getCourse();
  for(Course course:c){
    System.out.println(course+":"+course.getFee());
  }
 }

 public void viewOffers() {
   System.out.println("Ongoing Offers are:");
   Offer[] off = institute.getOffer();
   for (Offer offer : off) {
    System.out.println(offer.getOfferText());
   }
 }
  
 public void enrollCourse(int CourseId) {
 institute.enrollStudentCourse(CourseId, stuName);
 }
}
