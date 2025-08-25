package coreJavaOops;

class Memory {

    static int x = 100;
}

public class MemoryMain {

    public static void main(String[] args) {

        Memory m1 = new Memory();
        Memory m2 = new Memory();

        --m1.x;
        --m2.x;

        System.out.println(m1.x);
        System.out.println(m2.x);
    }

}
