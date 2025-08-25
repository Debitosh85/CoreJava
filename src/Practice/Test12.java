package Practice;

// public class Test12 {
//     public static void main(String[] args) {

//         int z = 5;

//         if (++z > 6 & ++z > 6) {
//             System.out.println("Inside if");
//             z++;
//         }
//         System.out.println(z);
//     }
// }

// class Test12 {

//     static int x = 100;

//     public static void greet() {
//         System.out.println("Hello from Java Universe");
//     }

// }

// class Test13 {

//     public static void main(String[] args) {

//         System.out.println(Test12.x); // This is Member Access Operator by using this we call the Member of the class
//         System.out.println("I am Test 13");
//         Test12.greet();

//     }
// }

class Test12 {

    public static void greet() {
        System.out.println("Hello Sulululu");
    }
}

class Test13 {

    public static void main(String[] args) {
        // You can call the summer method here if needed
        Test12.greet();
        Test13 t = new Test13();
        t.summer();

    }

    public void summer() {
        System.out.println("i will destoy");
    }
}