package polymorphism;
class OverloadBehavior {
  
  public int add(int x, int y) {
    return x + y;
  }
  public double add(double x, double y) {
    return x + y;
  }
  public String add(String a, String b) {
    return a + b;
  }
}

public class OverloadMethod {

  public static void main(String[] args) {
    OverloadBehavior b = new OverloadBehavior();
    int sum = b.add(20, 30);
    System.out.println("Sum of Integers:" + sum);
    
    double add = b.add(2.8, 3.9);
    System.out.println("Sum of double:" + add);
    
    String concat = b.add("Hello", "India");
    System.out.println("String after Concatenation:"+concat);
  }

}
