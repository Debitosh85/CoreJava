package practice;

/* class PassByValueDemo3 {

    private double custBalance = 12000;

    public double getCustBalance() {
        return custBalance;
    }

    public void setCustBalance(double balance) {
        this.custBalance = balance;
    }

    @Override
    public String toString() {
        return "PassByValueDemo3 [custBalance=" + custBalance + "]";
    }
}

public class SecondPassbyvalue {

    public static void main(String[] args) {

        PassByValueDemo3 p = new PassByValueDemo3();// 12000
        accept(p);
        System.out.println(p);// 18000
    }

    public static void accept(PassByValueDemo3 pass) {

        pass.setCustBalance(18000);
    }

}
 */

class Demo {

    private double balance = 12000;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double bal) {
        this.balance = bal;
    }

    @Override
    public String toString() {
        return "Demo [balance=" + balance + "]";
    }
}

public class SecondPass {

    public static void main(String[] args) {

        Demo d = new Demo();
        modify(d);
        System.out.println(d);
    }

    public static void modify(Demo d) {
        d = new Demo();
        d.setBalance(200000);
    }

}