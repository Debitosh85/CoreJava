
package Sreamapi;

import java.util.*;
import java.util.stream.Collectors;

public class Question1 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "Ankit", "Aman", "Ravi", "Anjali", "Ram", "Anurag", "Amit");

        List<String> count = list.stream()
                .filter(s -> s.startsWith("A"))
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(count);
    }
}
