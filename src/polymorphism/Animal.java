package polymorphism;

public class Animal {

  public void eat() {
    System.out.println("Generic Animal Eating");
  }

}

class Dog extends Animal {
  @Override
  public void eat() {
    System.out.println("Dog is Eating");
  }
}

class Puppy extends Animal {
  
}
