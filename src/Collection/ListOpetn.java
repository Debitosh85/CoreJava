package Collection;

import java.util.*;

public class ListOpetn {

  public static void main(String[] args) {

    /* List<Integer> li = new ArrayList<>();
    
    li.add(1, 5);
    li.add(2, 10);
    
    //li.remove(li);
    
    Integer i = li.get(1);
    System.out.println(i);
    
    Boolean b = li.isEmpty();
    System.out.println(b);
    
    /* for (Integer i : li) {
      System.out.println(i);
    } */
   
    List<Integer> li = new ArrayList<Integer>();

    li.add(1, 2);
    li.add(2, 3);
    li.add(3, 4);

    for (Integer i : li) {
      System.out.println(i);
    }
  }
}
