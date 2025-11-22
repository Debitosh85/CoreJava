package polymorphism;
class Overload {
  public Overload(){
    this(10,20);
  }
  public Overload (int x,int y){
    this(100,200,300);
    System.out.println("Sum of two Integer is:"+(x +y));
  }
  public Overload(int x,int y ,int z){

    System.out.println("Sum of 3 Integer is :"+(x +y +z));
  }
}

public class ConstOverload {
  public static void main(String[] args) {
    Overload o = new Overload();
  }

}
