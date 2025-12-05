package ExceptionHandling;

public class ExcptionDemo1 {

  public static void main(String[] args) {
      
    try {
      System.out.println("Try Block");
      for(int i=1;i>0;i++){
        System.out.println("Hello");
      }
    } catch (Exception e) {
      System.out.println("Catch Block");
    } finally {
      System.out.println("finally block");
    }

  }

}
