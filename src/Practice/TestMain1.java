package Practice;

class Test {

    public static void main(String[] args) {

        int arr[] = { 10, 20, 30 };

        modify(arr);

        System.out.println("MOdified Value:" + arr[1]);

    }

    public static void modify(int arr[]) {

        arr[1] = 40;

    }
}
