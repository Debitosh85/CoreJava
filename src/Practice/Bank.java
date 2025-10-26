package practice;

public class Bank {
  private double ammount =10000;
  public void calculate(double amount) {
    if (amount <= 0) {
      System.err.println("amount cant be deposited");
    } else {
      this.ammount = this.ammount + amount;
      System.out.println("after deposit the amount is::"+ammount);
    }
  }
  
  public void withdraw(double amount) {
    this.ammount = this.ammount - amount;
    System.out.println("Balance after withdraw::"+ammount);
  }

 }
