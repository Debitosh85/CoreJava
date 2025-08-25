package oops;

import java.util.*;

public class Book {

    private String bookName;
    private double bookPrice;

    public Book(String name, double price) {
        super();
        this.bookName = name;
        this.bookPrice = price;
    }

    public void setBookName(String name) {
        this.bookName = name;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookPrice(double price) {
        this.bookPrice = price;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public static Book bookDetails() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book Name:");
        String name = sc.nextLine();

        System.out.println("Enter BookPrice:");
        double price = sc.nextDouble();

        // Book book = new Book(name, price);
        // sc.close();
        return new Book(name, price);

    }

    @Override
    public String toString() {
        return "Book [bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
    }

    

}
