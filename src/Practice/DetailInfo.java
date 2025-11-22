package practice;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;
class Info {
  
  int x = 100;
  static Scanner sc = new Scanner(System.in);
  static int y = 100;
  int z = 300;
  
  public void input() {
  };

  public static void accept() {
  };

  public void display() {
  };

  public void show() {
  };

  public void m1() {
  };
}

public class DetailInfo {
  public static void main(String[] args) throws ClassNotFoundException {

    Class cls = Class.forName(args[0]);
    System.out.println("Class Name is:" + cls.getName());
    System.err.println("Package name:" + cls.getPackageName());
    
    Method[] methods = cls.getDeclaredMethods();
    System.out.println("Method names are:");
    int count = 0;
    for (Method method : methods) {
      System.out.println(method.getName());
      count++;
    }
    System.out.println("Total no of Methods are:" + count);
    
    count = 0;
    System.out.println("Total no of fields:");
    Field[] field = cls.getDeclaredFields();
    for (Field fields : field) {
      System.out.println(fields.getName());
      count++;
    }
    System.out.println("Total no of Fields are:"+count);
  }

}
