package Exam;

class Experiements {

    public static int getSquare(int n) {
        return n * n;
    }

    public static int getcube(int x) {
        return x * x * x;
    }
}

public class ExperimentMain {
    public static void main(String[] args) {

        int square = Experiements.getSquare(10);
        System.out.println("Square of 10 is: " + square);
        int cube = Experiements.getcube(20);
        System.out.println("Cube of 20 is: " + cube);

    }
}
