package deb.functionalinterface;

import java.util.Scanner;
import java.util.function.*;

class Product {
  int productId;
  String productName;
  double productPrice;

  public Product(int productId, String productName, double productPrice) {
    super();
    this.productId = productId;
    this.productName = productName;
    this.productPrice = productPrice;
  }

  @Override
  public String toString() {
    return "Product[productId=" + productId + ",productName=" + productName + ",productPrice=" + productPrice + "]";
  }
}
public class ProductSupplier {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      try (sc;) {
        Supplier<Product> p = () -> {
          System.out.println("Enter Produt Id:");
          int id = sc.nextInt();
          System.out.println("Enter the Name of the Product:");
          String name = sc.nextLine();
          name = sc.nextLine();
          System.out.println("Enter the Price of the Product");
          double price = sc.nextDouble();
          return new Product(id, name, price);
        };
        Product obj = p.get();
        System.out.println(obj);
      } catch (Exception e) {
        e.printStackTrace();
      }
      finally{
        sc.close();
      }
    }
  }
