package Inheritance;

class Father {
    
    protected double balance = 5000;
}

class Daughter extends Father {

    protected double balance = 18000;

    public void showDetails() {

        System.out.println("Daughter Balance:" + this.balance);
        System.out.println("Father Balance:" + super.balance);

    }

}

public class SuperVarDemo {
        public static void main(String[] args) {

        Daughter d = new Daughter();
        d.showDetails();
    }

}
