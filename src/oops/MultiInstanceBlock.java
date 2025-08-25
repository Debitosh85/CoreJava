package oops;

/* public class MultiInstanceBlock {

    private double bill;

    public MultiInstanceBlock() {

        super();
        bill = 1000;
        System.out.println(bill);
    }

    {
        bill = 2000;
        System.out.println(bill);
    }

    {
        bill = 3000;
        System.out.println(bill);
    }

    {
        bill = 4000;
        System.out.println(bill);
    }

    {
        bill = 5000;
        System.out.println(bill);
    }

}
 */

public class MultiInstanceBlock {

    public MultiInstanceBlock() {

        System.out.println("Constructor");

        {
            System.out.println("NSB 2");
        }
    }

    {
        System.out.println("Non Static Block 1");
    }

}