package deb.Int_erface;

class CustomerAccount implements Bank {
  double balance;

  public CustomerAccount(double balance) {
    super();
    this.balance = balance;
  }
  @Override
  public void deposit(double amount) {
    if (amount <= 0) {
      System.err.println("Deposit amount should not be Zero");
    }
    else {
    this.balance = balance + amount;
    System.out.println("available balance in user Account after deposit" + balance);
    }
  }
  @Override
  public void withdraw(double amount) {
    
    if (amount > this.balance) {
      System.err.println("Insufficient Balance");
    }
    else {
      this.balance = balance - amount;
      System.out.println("After withdrawal from user Account available balance:"+balance);
    }
  }
}
public class BankMain {
  public static void main(String[] args) {
    CustomerAccount c = new CustomerAccount(10000);
    c.deposit(10000);
    c.withdraw(5000);
  }

}
