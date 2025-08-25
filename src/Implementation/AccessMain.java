package Implementation;

import Connection.Access;

public class AccessMain {
    public static void main(String[] args) {

        ITest ob = Acess.getRef();
        ob.m1(10);
        ob.m2(20);

    }
}