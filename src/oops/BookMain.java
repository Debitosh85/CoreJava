package oops;

import java.util.*;

public class BookMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Objects");
        int noOfObject = sc.nextInt();

        for (int i = 1; i <= noOfObject; i++) {

            Book b = Book.bookDetails();
            System.out.println(b);

        }

        
        sc.close();

    }

}
