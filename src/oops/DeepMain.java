package oops;

public class DeepMain {
    public static void main(String[] args) {
        
        Deep d = new Deep("Laptop", 200);
        d.setPName("mobile");
        d.setPid(222);

        Deep d2 = new Deep();
        d2.setPName(d.getPname());
        d2.setPid(d.getPid());

        System.out.println("Before Modification");
        System.out.println(d);
        System.out.println(d2);

        System.out.println("After Modification");
        d2.setPName("Electri");
        d2.setPid(333);
        System.out.println(d);
        System.out.println(d2);
    }
}
