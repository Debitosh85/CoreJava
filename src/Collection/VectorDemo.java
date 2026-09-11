package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
  public static void main(String[] args) {

    Vector<String> v = new Vector<>();

    v.add("Apple");
    v.add("Orange");
    v.add("grapes");

    //System.out.println(v);

    Enumeration e = v.elements();

while (e.hasMoreElements()) {
  System.out.println(e.nextElement());
} 
    }
  }

