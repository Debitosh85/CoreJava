package practice;

import java.util.*;
public class PaymentProcess {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Payment p = new Payment();
    System.out.println("<Choose One from Below Available Options:🏦>");
    System.out.println("1.To Made Payment through Cash:💰");
    System.out.println("2.To Made Payment through Debit_Card:💳");
    System.out.println("3.To Made Payment through Credit_Card:🎫");
    System.out.println("Enter your Choice:");
    int choice = sc.nextInt();

    switch (choice) {
    case 1 -> {
      System.out.println("Enter the Amount want to withdraw:");
      int amount = sc.nextInt();
      p.makePayment(amount);
      System.out.println("Thank you for Using our Service:🎉");
      break;
    }

    case 2 -> {
      System.out.println("Enter the Name of Account Holder:");
      String name = sc.nextLine();
      name = sc.nextLine();
      System.out.println("Enter your 16 digit debit_Card Number:");
      String debitCardNumber = sc.nextLine();
      System.out.println("Enter the Amount want to withdraw:");
      double amount = sc.nextDouble();
      p.makPayment(name, debitCardNumber, amount);
      System.out.println("Thank You for Using our Debit_Card Service🎉");
      break;
    }

    case 3 -> {
      System.out.println("Enter your 16 digit Credit_Card Number:");
      String creditCard = sc.nextLine();
      creditCard = sc.nextLine();
      System.out.println("Enter the amount want to withdraw:");
      int amount = sc.nextInt();
      p.makePayment(creditCard, amount);
      System.out.println("Thank You for Using our Credit Card Service🎉");
      break;
    }
    default -> {
      System.out.println("Invalid Input Please Choose a Valid Option to Enjoy our Payment Service🏦");
    }
    }
    sc.close();
  }
}
