package practice;

public class StaticDemo {

  static final StaticDemo t1 = new StaticDemo();
 
  static {
    System.out.println("static Block");
  }
 
  {
    System.out.println("instance Block");
  }

  StaticDemo(){
    System.out.println("No arg Constructor");
  }


}
