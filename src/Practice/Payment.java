package practice;

public class Payment {

  //Payment through Cash
  public void makePayment(double amount) {
    if (validateAmount(amount)) {
      System.out.println("Payment Made through Cash:");
      System.out.println("Cash Amount is:" + amount);
      System.out.println("Payment Successful");
    }
  }
  //Payment Made through debitCard
  public void makPayment(String name,  String debitCardNumber,double amount) {
    if (validateAmount(amount) && validateCard(debitCardNumber)) {
      System.out.println("Payment made through Cash:");
      System.out.println("Name of the Card Holder:" + name);
      System.out.println("Card Number is :" + maskedCard(debitCardNumber));
      System.out.println("Cash Amount is:" + amount);
      System.out.println("Payment Successful");
    }
  }
  //payement Made Through Credit Card
  public void makePayment(String creditCardNumber,double amount) {
    if (validateAmount(amount) && validateCard(creditCardNumber)) {
      System.out.println("Payment Made through CreditCard:");
      System.out.println("Card Number is:" + maskedCard(creditCardNumber));
      System.out.println("Amount withdrawes:" + amount);
      System.out.println("Payment Successful");
    }
  }
  //private method to hide the actual logic to OuterWorld(amount Verifier)
  private boolean validateAmount(double amount) {
    if (amount <= 0 && amount== -amount) {
      System.out.println("Withdrawable amount should not less than 0 or nor -ve ");
      return false;
    }
    return true;
  }
  //private method  to hide logic to outerWorld (CardVerifier)
  private boolean validateCard(String cardNumber) {
    if (cardNumber.length() != 16) {
      System.out.println("Card Number must be in 16 digit");
      return false;
    }
    return true;
  }
  public String maskedCard(String maskedVerifier) {
    return "****_****_****" + maskedVerifier.substring(12);
  }
}
