package practice;

public class Access  {

  public static Itest getref() {
    
    Itest ob = new Itest(){

      public void m1(int a){

      System.out.println("The Value of a:"+a);

      }
    };
    return ob;
  }

}
