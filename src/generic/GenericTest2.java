package generic;

import java.util.*;

public class GenericTest2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("Naresh");
        al.add("I");
        al.add("Technologies");
        String name = al.get(1);
        System.out.println(name);
    }
}