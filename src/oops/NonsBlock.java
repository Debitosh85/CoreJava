package oops;

/*
 * public class NonsBlock {
 * NonsBlock() {
 * System.out.println("Constructor");
 * {
 * System.out.println("NSB");
 * }
 * }
 * 
 * public static void main(String[] args) {
 * new NonsBlock();
 * }
 * }
 */

public class NonsBlock {

    public NonsBlock() {

        System.out.println("No Parameterized");
    }

    {
        System.out.println("Non Static or Instance Block");
    }

    public NonsBlock(int x) {
        System.out.println("Parameterized Constructor" + x);
    }
}
