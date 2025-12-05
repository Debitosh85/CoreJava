package polymorphism;

public class WrapperClass4 {

  public static void main(String[] args) {
    /* Integer i = Integer.valueOf(12);
    Integer y = Integer.valueOf("23");
    Integer z = Integer.valueOf("111", 36);
    
    System.out.println("Value of i:" + i);
    System.out.println("value of y:" + y);
    System.out.println("Value of z:"+z); */
    
    Integer i = new Integer(100);
    Integer i1 = new Integer(100);
    System.out.println(i == i1);
    
    Integer a1 = new Integer(15);
    Integer a2 = new Integer(15);
    System.out.println(a1 == a2);
    
    //false == will match the address

    String str = Integer.toString(100);
    System.out.println(str+2);
  }

}
