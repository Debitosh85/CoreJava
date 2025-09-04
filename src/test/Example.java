package test;

class Example1 {

  final int c;

  {
    m1();
    c = 100;
  }

  public void m1() {
    System.out.println("i am m1 " + c);
  }
}

public class Example {
  public static void main(String[] args) {
    Example1 e = new Example1();
    System.out.println("User defined value :"+e.c);
    
  }
}

