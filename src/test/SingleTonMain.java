package test;

class SingleTon {

  private static final SingleTon instance = new SingleTon();

  private SingleTon() {

  }
  public static SingleTon getInstance(){
    return instance; 
  }
}

public class SingleTonMain {
  public static void main (String[] args){

    SingleTon s1 = SingleTon.getInstance();
    SingleTon s2 = SingleTon.getInstance();
    SingleTon s3 = new SingleTon();

    System.out.println(s1 == s2);

  }
}
