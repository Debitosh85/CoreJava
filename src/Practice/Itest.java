package practice;

public interface Itest {

  public void m1(int a);

  default  void m2(){
    System.out.println("i am Itest");
  }

}
