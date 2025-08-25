package coreJavaOops;

public class Student {

    String name;
    String rollNo;
    double height;

    public void studentDetails() {

        System.out.println("Student name is :" + name);
        System.out.println("Student rollNo is :" + rollNo);
        System.out.println("Student height is:" + height);
    }

    public void talk() {
        System.out.println("Every Saturday" + "\t" + name + " is Writing exam");
    }

}
