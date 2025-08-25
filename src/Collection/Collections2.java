package Collection;

import java.util.ArrayList;

import java.util.LinkedList;

public class Collections2 {

    public static void main(String[] args) {

        // Creating a LinkedList of String type
        // LinkedList<String> linkedList = new LinkedList<>();

        // // Adding elements to the LinkedList
        // linkedList.add("Jiban");
        // linkedList.add("Subham");
        // linkedList.add("Nakula");
        // linkedList.add("Badal");

        // // Converting LinkedList to ArrayList
        // ArrayList<String> arrayList = new ArrayList<>(linkedList);

        // // Printing the elements of the ArrayList
        // for (String name : arrayList) {
        // System.out.println(name);
        // }

        // // Printing the ArrayList before reversing
        // System.out.println("Names before reverse: " + arrayList);

        // // Reversing the ArrayList
        // Collections.reverse(arrayList);

        // // Printing the ArrayList after reversing
        // System.out.println("Names after reverse: " + arrayList);
        // }
        // }

        LinkedList<String> li = new LinkedList<>();
        li.add("jiban");
        li.add("Situ");

        ArrayList<String> al = new ArrayList(li);

        for (String names : al) {
            System.out.println(names);

        }

    }
}