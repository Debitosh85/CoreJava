package Stream;

import java.util.ArrayList;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("A");
        al.add("BC");
        al.add("CDE");
        al.add("DEFS");
        List<String> list = al.stream().filter(x -> x.length() >= 2).peek(x -> System.out.println("Processing: " + x))
                .toList();
        System.out.println(list);
    }
}
