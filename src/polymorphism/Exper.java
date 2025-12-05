package polymorphism;
class Guardian{
  public static void print(){
    System.out.println("Guardian");
  }
}

class Kid extends Guardian{

}

public class Exper {

  public static void main(String[] args) {

    Kid.print();
    Kid k = new Kid();
    k.print();
      
  }

}
