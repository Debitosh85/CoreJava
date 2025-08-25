package heapandstack;

public class HeapMain {

    public static void main(String[] args) {

        int val = 100;
        MemAlloc m = new MemAlloc("Debitosh", 5);
        m1(m);
        System.out.println(m.getId());
    }

    public static void m1(MemAlloc n) {

        n.setId(7);

        n = new MemAlloc("Debitosh", 8);

        System.out.println(n.getId());

    }

}
