package polymorphism;

public class AutoUnbox {

  public static void main(String[] args) {

    //converting Wrapper into Primtive upto 1.4
    Integer i = 15;
    int x = i.intValue();
    System.out.println(x);

    //Converting Wrapper into Primitive in 1.5
    Integer j = 100;
    int y = j;
    System.out.println(y);

    //Calling All the Methods provided by Wrapper class Sub class of (Java.lang.Number)
    // These are the Methods  Provided by 6 wrapper classes to Conversion from Primitive to wrapper

    /* Integer k = 100;
    System.out.println(k.intValue());
    System.out.println(k.byteValue());
    System.out.println(k.longValue());  
    System.out.println(k.shortValue());
    System.out.println(k.doubleValue());
    System.out.println(k.floatValue());

    //Calling Char Value()
    Character c = 'A';
    System.out.println(c.charValue());

    //Calling Boolean Value ()
    Boolean b = true;
    System.out.println(b.booleanValue()); */

    /* 
    Due to integer Caching it will return true .cause 100 is within the Byte Range 
    So if the range is from -128 to 127 then new Object wont be created . So the same Object 
    used for Multiple times .
    */
    Integer in = 100;
    Integer in1 = 100;
    System.out.println(in == in1);
    System.out.println(in.equals(in1));
    

    Integer in2 = 200;
    Integer in3 = 200;
    System.out.println(in2 == in3);
    System.out.println(in2.equals(in3));
    
    Integer in4 = 300;
    Integer in5 = 300;
    System.out.println(in4 == in5);
    System.out.println(in4.equals(in5));

    long l = 12;//implicit or Widening
    byte b = (byte) 12L;//Explicit or Narrowing 
  }

}
