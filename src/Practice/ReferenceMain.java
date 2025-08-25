package Practice;

import java.util.*;

class Reference {

    Reference s1 = null;// s1 instance + Reference

    static Scanner s2 = new Scanner(System.in);// s2 Static + Reference

    public void accept(Reference rr) { // rr Parameter Variable

        Reference s3 = new Reference();// S3 Local Variable

        System.out.println("Executed");

    }

}

public class ReferenceMain {

    public static void main(String[] args) {

        Reference s4 = new Reference();
        s4.accept(s4);

    }
}
