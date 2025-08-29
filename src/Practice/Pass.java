package practice;

/*
 * public class Pass {
 * 
 * public static void main(String[] args) {
 * 
 * int x = 100;
 * accept(x);
 * System.out.println("Value of X is:" + x);
 * 
 * }
 * 
 * public static void accept(int y) {
 * 
 * y = 200;
 * }
 * 
 * }
 */
/*
 * public class Pass {
 * public static void main(String[] args) {
 * 
 * int x = 100;
 * x = accept(x);
 * System.out.println("value of x is ::" + x);
 * 
 * }
 * 
 * public static int accept(int y) {
 * y = 200;
 * return y;
 * 
 * }
 * }
 */

// In the Case of Object even if the Method does have any return type during
// passing the reference copy Still it Modifies the Original data because it
// Pointing to Same memory location (it happening due to java.util.Arrays)
// But if we are reassigning the reference then the Change is not reflected due
// Memory address is changed .

/*
 * public static void main(String[] args) {
 * 
 * int[] arr = { 10, 20, 30 };
 * modify(arr);
 * System.out.println("Values in a[0] Index:" + arr[0]);
 * 
 * }
 * 
 * public static void modify(int[] a) {
 * 
 * a[0] = 99;
 * 
 * }
 */

/*
 * public class Pass {
 * public static void main(String[] args) {
 * 
 * int[] arr = { 10, 20, 30 };
 * 
 * modify(arr);
 * 
 * System.out.println("values" + arr[0]);
 * }
 * 
 * public static void modify(int[] a) {
 * a = new int[] { 10, 20, 40 };
 * a[0] = 500;
 * }
 * }
 */