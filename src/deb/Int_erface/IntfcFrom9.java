package deb.Int_erface;

public interface IntfcFrom9 {

  int MAX_VALUE = 100; // jdk 1.0

  void m1(); // jdk 1.0

  default void m2() { // jdk 1.8
    m4();
    m5();
  }
  
  static void m3() { // jdk 1.8
    m4();
  }
  private static void m4() {
    System.out.println("Private static method from java 9");
  }

  private void m5() {
    System.out.println("private non-static method from java 9");
  }
}
