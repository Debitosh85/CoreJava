package Inheritance;

import java.util.*;
public class Trainer {
  
  public static void viewStudentDetails(Pupil obj) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Student id");
    int id = sc.nextInt();

    if (id == obj.getStudentId()) {
      System.out.println(obj);
    }
    else {
      System.err.println("Invalid Id Student not Found");
    }
  }


}
