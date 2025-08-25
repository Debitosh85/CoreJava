// package Practice;

// import java.util.Arrays;

// class Tes10 {

// public static void main(String[] args) {

// String str = "India";
// char c = str.concat("is great").toLowerCase().charAt(0);
// System.out.println(c);
// }
// }

// class Test10 {
// public static void main(String[] args) {

// System.out.println("Main method Started");
// m1();
// System.out.println("Main method Ended");

// }

// public static void m1() {
// System.out.println("M1 method Started");
// m2();
// System.out.println("M1 method Ended");
// }

// public static void m2() {
// System.out.println("Hii i am M2 method");
// }
// }
// class Test10 {
// public static void main(String[] args) {
// java.util.Scanner sc = new java.util.Scanner(System.in);
// System.out.println("Enter a number");
// int n = sc.nextInt();

// System.out.println("Enter a name");
// String name = sc.nextLine();
// name = sc.nextLine();
// System.out.println("NUmber is :" + n + "\n" + "Name is " + name);
// sc.close();

// }
// }

// class Test10 {
// public static void main(String[] args) {

// int x = 15;
// int y = x++;

// System.out.println(x + "" + y);

// }
// }

// class Test10 {

// public static void main(String[] args) {
// System.out.println("Enter your name");
// char gender = args[0].charAt(0);

// System.out.println("your gender is :" + gender);
// }

// }

// class Test10 {

// static int x = 100;

// public static void greet() {

// System.out.println("Hello Batch 39");
// }

// }

// class MainTest {

// public static void main(String[] args) {

// System.out.println(Test10.x);
// Test10.greet();
// }
// }

// class Test10 {

// int x = 100;

// public void greet() {
// System.out.println("Hello Java People");
// }
// }

// class MainTest {

// public static void main(String[] args) {

// Test10 t = new Test10();
// System.out.println(t.x);
// t.greet();

// }

// }

// import java.util.Scanner;

// class Test10 {
// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);

// System.out.println("Enter a Charecter:");
// char color = sc.next().toLowerCase().charAt(0);

// switch (color) {
// case 'r':
// System.out.println("red");
// break;
// case 'g':
// System.out.println("Green");
// break;
// case 'b':
// System.out.println("blue");
// break;

// default:
// System.out.println("No Match Found");
// break;
// }
// sc.close();

// }
// }

// class Test10_ {

// public static void main(String[] args) {

// int x = 1;
// do {

// System.out.println("The Value of x is:" + x);
// x++;
// } while (x <= 10);

// }
// }

// class Test10 {
// public static void main(String[] args) {

// int x = 10;
// while (x >= -1) {
// System.out.println("Value of x is :" + x);
// x--;
// }
// }
// }

// class Test10 {
// public static void main(String[] args) {

// int arr[] = { 60, 50, 40, 30, 20, 10 };

// Arrays.sort(arr);

// for (int x : arr) {
// System.out.println("The Values of x in Sorting :" + x);
// }
// }
// }

// class Test10 {
// public static void main(String[] args) {

// String[] cities = { "Hydrabad", "Pune", "Maharastra", "Punjab" };

// java.util.Arrays.sort(cities);

// for (String city : cities) {

// System.out.println("Various Cities of India💚💙🧡" + city);
// }

// }
// }

// class Test10 {
// public static void main(String[] args) {

// Object[] arr = { 10, 10.10, "Hydrabad", "@Dhoni", 'A', new String("Pune") };

// for (Object values : arr) {
// System.out.println("Random Values :" + values);
// }

// }
// }