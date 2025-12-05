package polymorphism;


abstract class Shape {

  public abstract void draw();

}

class Circle extends Shape {

  @Override
  public void draw() {
    System.out.println("Radius of Circle 2*3.14*r");
  }
}

class Triangle extends Shape {
  
  @Override
  public void draw() {
    System.out.println("Height of the triangle is 1/2*base*height");
  }
}

public class ShapeMain {
  public static void main(String[] args) {
    Shape s = null;
    s = new Circle();
    s.draw();
    System.out.println("==================");

    s = new Triangle();
    s.draw();
  }

}
