package Collection;

import java.util.*;

public class DynamicallyGrowable {

  public static void main(String[] args) {
      
    List<Integer> v = new Vector<>();
    v.add(10);
    v.add(20);
    v.add(30);
    v.add(40);
    v.add(50);
    v.add(60);
    v.add(70);
    v.add(80);
    v.add(90);
    v.add(100);

    for (Integer i : v) {
      System.out.println(i);
    }
    System.out.println("size is:"+v.size());
    v.add(999);
    for (Integer j : v) {
      System.out.println(j);
    }
    System.out.println("size is:"+v.size());
    
  }
}

/* 
1) public boolean isEmpty()-> To check if the list is empty or not
2) public void clear()-> To clear all the element from the list
3) public int size()-> To get the length of the list(To knew about total no of elments in the list)
4) public void add(int index)-> To add element to the collection based on index
5) public Boolean addAll(int index,Object o)-> To insert collection Object to the List on the basis of index
6) public Object get(int index)-> To retrive the element from the list based on index position 
7) public Object set(int index,Object o)-> To Override or replace Collection Object into the existing list based on index postion.
8) public Object remove(int index)-> To remove the elment from the list based on idex
9) public Boolean remove (Object o)-> To remove the Collection Object from list based on object.it is the method of Collection interface list interface extends it.
10)public int indexof()-> To know the index of list element
11)public int last indexof()-> To know the last index of the element
12)public Iterator iterator()-> To fetch or retrive or Iterate over Collection element in forward direction only
13)public ListIterator listiterator()-> To fetch or retrive or Iterate Over Collection in Both direction (forward & backward)
 */