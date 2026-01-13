package polymorphism;

public class AutoBoxing {
  public static void main(String[] args) {
    int i = 12;
    Integer y = Integer.valueOf(i);
    System.out.println(y);

    byte b = 17;
    Byte z = Byte.valueOf(b);
    System.out.println(z);

    short s = 128;
    Short x = Short.valueOf(s);
    System.out.println(x);

    long l = 12222;
    Long t = Long.valueOf(l);
    System.out.println(t);

    char c = 'A';
    Character ch = Character.valueOf(c);
    System.out.println(ch);

    double d = 12.33;
    Double du = Double.valueOf(d);
    System.out.println(du);

    float f = (float) 13.45;
    Float fl = Float.valueOf(f);
    System.out.println(fl);

    boolean g = true;
    Boolean bl = Boolean.valueOf(g);
    System.out.println(bl);

    

  }
}
//Upto 1.4 value of() is required to Convert primitive to Wrapper class Object 
