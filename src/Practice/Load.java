package practice;
class Loads {

  static{
    System.out.println("This is Static block");
  }
}

public class Load {
  public static void main(String[] args) throws ClassNotFoundException {

    Class.forName("Loads");
      
  }
}