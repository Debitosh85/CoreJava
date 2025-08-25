package Practice;

/*
 * lass Test10 {
 * 
 * public static void main(String[] args) {
 * 
 * Long ph = 9583_281_271L; // '_' underscore allowed from JDk 1.7 version
 * System.out.println(ph);
 * }
 * }
 */

/*
 * public class Test10 {
 * public static void main(String[] args) {
 * final int x = 127;
 * byte b = x;
 * System.out.println("The Answer of b is :" + b);
 * 
 * }
 * }
 */

/*
 * class Test10 {
 *
 * public static void main(String[] args) {
 * var x = 90;
 * System.out.println("Var value is:" + x);
 *
 * x = 99;
 * System.out.println("Now var value is:" + x);
 *
 * x = "NIT"; // Integer can't be replaced in the place of String
 * }
 * }
 */
/*
 * class Test10 {
 * public static void main(String[] args) {
 * // Integer to Binary
 * System.out.println(Integer.toBinaryString(7));
 * 
 * // Integer to Octal
 * // 015 (octal) is 13 in decimal
 * System.out.println(Integer.toOctalString(015));
 * 
 * // Integer to Hexadecimal
 * System.out.println(Integer.toHexString(0xadd));
 * }
 * }
 */

// public class Test3 {
// public static void main(String[] args) {
// double x = 0129.89;

// double y = 0167;

// // double z = 0178;

// System.out.println(x + "," + y);

// double x = 0X29;

// double y = 0X9.15; //error

// System.out.println(x+","+y);

// double d1 = 15e-3;
// System.out.println("d1 value is :"+d1);

// double d2 = 15e3;
// System.out.println("d2 value is :"+d2);

// double b = 0791.0;
// System.out.println("b value is :"+b);

// double c = 0777;
// System.out.println("c value is :"+c);

// double d = 0Xdead;
// System.out.println("d value is :"+d);
// }
// }

// class Test3 {
// public static void main(String[] args) {

// int x = 'A';
// int y = '\u0041';

// System.out.println("x value is :" + x);
// System.out.println("y value is :" + y);
// }
// }

class Test3 {
	public static void main(String[] args) {
		// String is a class in java can be declared using 3 ways
		// String s1 = "Hello"; // String literal
		// System.out.println(s1);

		// String s2 = new String("India");// by using new keyword
		// System.out.println(s2);

		// char ch[] = { 'R', 'A', 'J' };// by using charecter Array Oldtechnique
		// System.out.println(ch);

		char ch = 'A';
		ch++;
		System.out.println(ch);
	}
}