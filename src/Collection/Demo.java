package Collection;


import java.util.*;

public class Demo {

  public static void main(String[] args) {

    List<Integer> li = new ArrayList<>();

    li.add(1, 2);
    li.add(2, 3);
    li.add(3, 4);

    for (Integer i : li) {
      System.out.println(i);
    } 
  }

}
