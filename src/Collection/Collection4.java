package Collection;

import java.util.TreeSet;

public class Collection4 {

	public static void main(String[] args) {
		
		TreeSet<StringBuffer> ts1 = new TreeSet<>();
		
		ts1.add(new StringBuffer("B"));
		ts1.add(new StringBuffer("A"));
		ts1.add(new StringBuffer("C"));
		ts1.add(new StringBuffer("A"));
		System.out.println(ts1);

		
		
        TreeSet<StringBuilder> ts2 = new TreeSet<>();
		
        ts2.add(new StringBuilder("B"));
        ts2.add(new StringBuilder("A"));
        ts2.add(new StringBuilder("C"));
        
		System.out.println(ts2);
		
		
		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getProperty("java.vendor"));
		
		

	}

}




