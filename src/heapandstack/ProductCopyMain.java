package heapandstack;

public class ProductCopyMain {

    public static void main(String[] args) {

        ProductCopy p = new ProductCopy(111, "Laptop", 62000.0);
        ProductCopy p1 = new ProductCopy(p);
        System.out.println(p);
        System.out.println(p1);
    }

}
