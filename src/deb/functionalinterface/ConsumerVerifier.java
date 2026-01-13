package deb.functionalinterface;

import java.util.function.*;
public class ConsumerVerifier {

  public static void main(String[] args) {
      
    Consumer<Integer> b = num -> System.out.println("it is a number" + num);
    b.accept(12);

    Consumer<String> s = name -> System.out.println("My Name is :" + name);
    s.accept("accept");
    
    Consumer<Customer> c = customer -> System.out.println("Id of the " + customer);
    c.accept(new Customer(111));
  }
}
class Customer {

  public int id;

  public Customer(int id) {
    this.id = id;
  }
  @Override
  public String toString() {
    return "Customer[id="+id+"]";
  }
  
}