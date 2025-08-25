package heapandstack;

public class MemComplex {

    int val;
    MemComplex m;

    public MemComplex(int val) {
        this.val = val;
    }

    public MemComplex(int val, MemComplex m) {

        this.val = val;
        this.m = m;
    }

    @Override
    public String toString() {
        return "MemComplex[val=" + val + ",m=" + m + "]";
    }

}
