**Interface**
--------------
-> interface is a keyword and similar like class which provide working functionality of class
-> Till java 1.7 interface allow only abstract methods no general or concrete or default & static methods are not allowed
-> From java 1.8 default & static methods are allowed inside interface
-> Variables in interface are public static final .
-> Methods are by-default public & abstract So the sub class which is overriding the methods it must enable with public
   abstract method during Overriding 
-> By using interface we achieve 100% abstraction
-> To implement the members of interface java Software people introduced implements keyword
-> if a Subclass implements an Interface then that class must Override all the abstract methods of that other wise 
   it became abstract and its object wont be created
-> Interfaces Object can't be created but reference created for interface
-> by using interface we can achieve multiple inheritance 
-> By using interface we can achieve loose coupling 

*B.N*
------
-> Inside interface we can't declare any kind of block(static or nonstatic) or any kind of constructor & instance variable as well. 

Loose Coupling
--------------
-> If the degree of dependency from one class Object another class Object is low then its called 
   loose Coupling 
-> If the degree of dependency between One class Object to another class Object is High then it is tightly Coupled     (Composition).

 **HighCohesion**
-------------------
-> Our private data member must be accessible via public methods (Setter & getter) .so between our data & method must 
   high Cohesion(tight coupling) . to perform validation over data outside .
 
 interface as Return type of method
 -----------------------------------
 -> its always better practice to take interface as return type of method . So that we can return its implementer class
    Object and if in future if any class implements it then we can that implementer class Object as well.