package practice;

class SupContext {

  protected int x=100;
  
}

class SubContext extends SupContext {

  protected int x = 200;

  public static void access() {
    SubContext s1 = new SubContext();
    System.out.println(s1.x);

    SupContext s2 = s1; //upcasting
    System.out.println(s2.x);
  }
}

public class NoContext {
  public static void main(String[] args) {
      SubContext.access();
  }
}
