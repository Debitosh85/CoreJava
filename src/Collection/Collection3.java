package Collection;

class Collection {
    static int b = 20;

    public static void main(String[] args) {
        int a = 10;

        Collection collection = new Collection();
        collection.print(a);
    }

    public void print(int a) {
        System.out.println("The value of a is :" + a);
        System.out.println("The value of b is :" + b);
    }

}