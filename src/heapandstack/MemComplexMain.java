package heapandstack;

public class MemComplexMain {

    public static void main(String[] args) {

        MemComplex m1 = new MemComplex(100);

        MemComplex m2 = new MemComplex(200, m1);

        MemComplex m3 = new MemComplex(300, m1);

        MemComplex m4 = new MemComplex(400, m3);

        m2.m = m3;

        m3.m = m4;

        m1.m = m2.m;

        m2.m = m4.m;

        System.out.println(m1.m.val);
        System.out.println(m2.m.val);
        System.out.println(m3.m.val);
        System.out.println(m4.m.val);

    }

}
