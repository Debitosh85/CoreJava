package heapandstack;

public class MultiGc {

    private int i1 = 900;

    public static void main(String[] args) {

        MultiGc m = new MultiGc();

        MultiGc m2 = new MultiGc();

        MultiGc m3 = modify(m2);

        m = null;

        // [4 Objects illegeble for Garbage Collection 1000x,2000x and 5000x,6000x ]
        System.out.println(m2.i1);
    }

    public static MultiGc modify(MultiGc m4) {

        m4.i1 = 9;

        m4 = new MultiGc();
        m4.i1 = 20;

        System.out.println(m4.i1);

        m4 = null;
        return m4;

    }

}
