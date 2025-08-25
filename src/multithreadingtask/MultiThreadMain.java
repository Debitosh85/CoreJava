package multithreadingtask;

class Multi {

    private int number = 1;
    private final int MAX = 20;

    public synchronized void printodd() {

        while (number <= MAX) {
            if (number % 2 == 0) { // if even Wait
                try {
                    wait();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Odd number is :" + number);
                number++;
                notify();
            }
        }
    }

    public synchronized void printEven() {
        while (number <= MAX) {
            if (number % 2 != 0) {
                try {
                    wait(); // if Odd Wait
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Even number is :" + number);
                number++;
                notify();
            }
        }
    }

    public class multithreadingtask {
        public static void main(String[] args) {

            Multi m1 = new Multi();

            Thread printOdd = new Thread(() -> m1.printodd());
            Thread printEven = new Thread(() -> m1.printEven());

            printOdd.start();
            printEven.start();
        }
    }

}