package test;

import java.util.Scanner;

public class ExperMain {
    public static void main(String[] args) {
        Exper e1 = new Exper();

        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the laptop name: ");
        e1.laptopName = sc.nextLine();
        System.out.println("Enter the laptop price: ");
        e1.laptopPrice = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the laptop brand: ");
        e1.laptopBrand = sc.nextLine();
        e1.laptopInformation();
        System.out.println(e1);
        sc.close();

    }
}
