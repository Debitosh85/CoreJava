package oops;

import java.util.Scanner;

public class ElectronicsMain {

    public static void main(String[] args) {

        Electronics e = new Electronics();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Laptop brand:");
        e.laptopBrand = sc.next();

        System.out.println("Enter Laptop Name:");
        sc.nextLine();
        e.laptopName = sc.nextLine();


        System.out.println("Is the Laptop Touch Screen:");
        e.isTouchScreen = sc.nextBoolean();

        System.out.println("Price of the Laptop is:");
        e.price = sc.nextDouble();

        e.showLaptopInformation();

        sc.close();

    }

}
