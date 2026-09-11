package polymorphism;

class Dynamic {

  Dynamic() {
    show();
  }
  public void show() {
    System.out.println("A");
  }
}

class Dynamics extends Dynamic {

  String msg = "Hello";

  Dynamics() {
    msg = "Hiii";
  }

  public void show() {
    System.out.println(msg);
  }
}

public class DynamicMain {
  public static void main(String[] args) {

    Dynamic d = new Dynamics();
  }
}

/* 
Output
---------
null 
-> Here Output Came null cause . During upcasting when we kept the reference of child inside & Object is created for child So at the time creating the object constructor is invoked . when the child constructor is invoked (Constructors first line is reserved for super()) So parent constructor is invoked first and the instance variable of child initialized with Default value(null) in our case. Untill the Parent constructor completes the instance initializer of child will not start . So the Parent Constructor completed and Due to run time polymerphisim Show() method of Child is invoked . 

-> So whenever a non-static, non-final, non-private method is invoked on that object —
JVM will look at the actual object type (B) and execute B’s overridden version.

Even if the call happens:

Inside parent constructor

Inside another parent method

Inside main

Anywhere

It doesn’t matter.
 */

