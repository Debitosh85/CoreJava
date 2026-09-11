package Edu.multithread;

public class InstituteMain {
  public static void main(String[] args) {

    Course[] c = { new Course(1, "Math", 5000), new Course(2, "Sc", 3000), new Course(3, "SST", 2000),
        new Course(4, "EVS", 25000) };
    
    Offer[] of = { new Offer("20% off for limited time only::") };

    EducationInstitute e = new EducationInstitute(c, of);
    Student s = new Student("Danny", e);
    Student s1 = new Student("Lara", e);


    Runnable r = new Runnable(){
    @Override
    public void run(){
    s.viewCoursesAndFees();
    s.viewOffers();
    s.enrollCourse(1);
      }
    };

    System.out.println("-------------------------");
    Runnable r1 = new Runnable(){
      @Override
      public void run(){
    s1.viewCoursesAndFees();
    s1.viewOffers();
    s1.enrollCourse(2);
      }
    };

    Thread t = new Thread(r);
    Thread t1 = new Thread(r1);

    t.start();
    t1.start();
  }
}