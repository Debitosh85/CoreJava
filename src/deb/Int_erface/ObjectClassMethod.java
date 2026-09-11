package deb.Int_erface;

public class ObjectClassMethod {

  public static void main(String[] args) {
      
    Drawable d = null;
    d.hashCode();
    d.equals(null);
    d.toString();

    /* interface can't extend a  class 
    -> So if any interface doesn't extending any super interface then all the public
    Methods of Object class implicitely redeclared inside interface to support upcasting 
    in the form of abstract Method .
    
    -> We can't override all the public methods of Object class inside interface as 
    default method 
     */

  }

}
