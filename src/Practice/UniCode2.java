package Practice;

public class UniCode2 {

    public static void main(String[] args) {

        char ch = 'A';
        char x = 97;
        char y = '\u0041';

        System.out.println(ch + "" + x + "" + y);

        System.out.println("min Value of Char:" + Character.MIN_VALUE);
        System.out.println("max Value of Char:"+Character.MAX_VALUE);
        System.out.println("Size of Char:"+Character.SIZE);

    }
}
