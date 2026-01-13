package src.deb.functionalinterface;

class Accept<T> {

  private T data;

  public Accept(T data) {
    super();
    this.data = data;
  }

  public T getData() {
    return data;
  }
}

class Product {
  
  private int productId;

  public Product(int productId) {
    super();
    this.productId = productId;
  }
}

public class TypeParameter {

  public static void main(String[] args) {

    Accept<Integer> a = new Accept<Integer>(12);
    System.out.println("Value is(Int):" + a.getData());
    
    Accept<Double> d = new Accept<Double>(12.34);
    System.out.println("Value is(Double):" + d.getData());
    
    Accept<Boolean> b = new Accept<Boolean>(false);
    System.out.println("Value is(Boolean):" + b.getData());
    
    Accept<Product> p = new Accept<Product>(new Product(111));
    System.out.println("Product type is(Product):"+p.getData());
  }
}
