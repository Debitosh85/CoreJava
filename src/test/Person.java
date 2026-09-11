package test;

public class Person {

  public void walk() {
    System.out.println("Generic person can walk");
  }
}

class Student extends Person {

  @Override
  public void walk() {
    System.out.println("Student is walking");
  }
}

class Crickter extends Person {
  
  @Override 
  public void walk() {
    System.out.println("Crickter is walking");
  }
}

