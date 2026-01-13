package FunctionalInterface;

public class Calculation {
  public static void main(String[] args) {
    //Annonymous inner class
    Calculator c = new Calculator(){
      @Override
      public int add(int a, int b){
        int sum = a + b;
        return sum;
      }
    };

    Calculator d = (a, b) -> a + b;
    int sum2 = d.add(7, 8);
    System.out.println("Sum2 is:"+sum2);

    int result = c.add(5, 7);
    System.out.println("Sum is:" + result);
    
    System.out.println(c.getClass().getName());
    System.out.println(d.getClass().getName());
  }

}
