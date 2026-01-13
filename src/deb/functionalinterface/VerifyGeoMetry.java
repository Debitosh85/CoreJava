package deb.functionalinterface;

import java.util.Scanner;
@FunctionalInterface
interface Geometrys {
  Double calculation(int num);
}
public class VerifyGeoMetry {
  public static void main(String[] args) {
    Geometrys g = num ->{
      if (num <= 0) {
        return -1D;
      }
      else if (num % 2 == 0) {
        Double e = (double)(num * num);
        return e;
      }
      else {
        Double o = (double)(num * num * num);
        return o;
      }
    };
    Scanner sc = new Scanner(System.in);
    int no = sc.nextInt();
    System.out.println("Checking the no:" + g.calculation(no));
    sc.close();
  }

}
