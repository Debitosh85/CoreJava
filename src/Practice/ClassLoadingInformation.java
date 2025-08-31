package practice;
/* class Employee {
    
}
class Manager {

}

class Sample {
}

public class ClassLoadingInformation {

  public static void main(String[] args) {
  
    java.lang.Class cls = Employee.class;

    System.out.println("FQN:" + cls.getName());
    
    cls = Manager.class;
    System.out.println("FQN:" + cls.getName());
    
    cls = Sample.class;
    System.out.println("FQN:"+cls.getName());
  
}

}
 */

/* class Access {
  
 }

 public class ClassLoadingInformation {
   public static void main(String[] args) {
     System.out.println("Name of The Class Loader is:");
     System.out.println(Access.class.getClassLoader());
    
  }
} */


/* class Access {
  
}

public class ClassLoadingInformation {
  public static void main(String[] args) {
    
    System.out.println("Super class of Application Class Loader:");
    System.out.println(Access.class.getClassLoader().getParent());
  }
} */

class Access {
  
}

public class ClassLoadingInformation {
  public static void main(String[] args) {

    System.out.println("Super Class Of Platform ClassLoader");
    System.out.println(Access.class.getClass().getClassLoader().getParent().getParent());
    
    // java.lang.NullPointerException: Cannot invoke "java.lang.ClassLoader.getParent()" because the return value of "java.lang.Class.getClassLoader()" is null

    /* OutPut comes null because the BootStrap class Loader is the built in class Loader for Jvm So for that reason the implementation is not given (it will load only predefined.class file also called API level .class files) hence we are getting null */
  }
}