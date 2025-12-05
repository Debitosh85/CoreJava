package polymorphism;

public class WrapperClass3 {

  public static void main(String[] args) {
    int a = 12;
    Integer b = Integer.valueOf(a);  //Upto 1.4 used For AutoBoxing
    System.out.println(b);

    int c = 12;
    Integer d = c;    // from 1.5 Onwards
    System.out.println(d);
  }

}
