package Inheritance;

import java.util.*;
import java.text.DecimalFormat;

class Shape {

    protected int x;

    Shape(int x) {
        this.x = x;
        System.out.println("The value of x:" + x);
    }
}

class Circle extends Shape {

    final double pi = 3.14;

    Circle(int radius) {

        super(radius);
    }

    public void areaOfCircle() {

        double area = pi * x * x;
        DecimalFormat df = new DecimalFormat("00.00");
        System.out.println(df.format(area));
    }
}

class Rectangle extends Shape {

    protected int breadth;

    Rectangle(int length, int breadth) {
        super(length);
        this.breadth = breadth;
    }

    public void areaOfRectangle() {

        int area = super.x * this.breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class HierarchicalDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of Circle:");
        int radius = sc.nextInt();

        Circle c = new Circle(radius);
        c.areaOfCircle();

        System.out.println("Enter the length of the Rectangle:");
        int length = sc.nextInt();

        System.out.println("Enter the breadth of the Rectangle");
        int breadth = sc.nextInt();

        Rectangle r = new Rectangle(length, breadth);
        r.areaOfRectangle();
        sc.close();

    }

}
