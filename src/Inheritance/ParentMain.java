package Inheritance;

/*
 * class Parent {
 * 
 * Parent() {
 * 
 * super();
 * System.out.println("Parent Class No Argument Constructor");
 * }
 * 
 * Parent(String str) {
 * 
 * this();
 * System.out.println("Child Value:" + str);
 * }
 * }
 * 
 * class Child extends Parent {
 * 
 * Child() {
 * 
 * super("NIT");
 * }
 * 
 * }
 * 
 * public class ParentMain {
 * 
 * public static void main(String[] args) {
 * Child c = new Child();
 * 
 * }
 * }
 */

/*
 * class Parent {
 * 
 * Parent() {
 * 
 * this(15);
 * 
 * System.out.println("Parent class No argumented Constructor");
 * }
 * 
 * Parent(int x) {
 * 
 * System.out.println("X Value is:" + x);
 * 
 * }
 * }
 * 
 * class Child extends Parent {
 * 
 * Child() {
 * 
 * }
 * 
 * }
 * 
 * public class ParentMain {
 * public static void main(String[] args) {
 * 
 * Child c = new Child();
 * }
 * }
 */

class Parent {

    int x;

    Parent(int x) {

        this.x = x;
        System.out.println("X Value is:" + this.x);
    }
}

class Child extends Parent {

    Child(int x) {

        super(x);
    }

    public void show() {

        double area = x * x;
        System.out.println("area of the Square is:" + area);
    }
}

public class ParentMain {

    public static void main(String[] args) {

        Child c = new Child(30);
        c.show();

    }
}