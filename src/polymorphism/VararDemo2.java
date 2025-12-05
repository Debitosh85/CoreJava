package polymorphism;

class AddParameter {

  public void acceptAndaddParameter(int... x) {
    int sum = 0;

    for (int value : x) {
      sum = sum + value;
    }
    System.out.println("Sum of Passed Values:"+sum);
  }
}

public class VararDemo2 {
  public static void main(String[] args) {
    AddParameter a = new AddParameter();
    a.acceptAndaddParameter(10, 20);
    a.acceptAndaddParameter(100,200,300);
  }

}
