package oops;

public class ScopyMain {

    public static void main(String[] args) {

        Scopy s = new Scopy("Virat", 15);
        System.out.println(s);

        System.out.println("======================");

        Scopy s1 = s;
        s1.setStudentName("Sai");
        s1.setStudentAge(10);
        System.out.println(s1);
        System.out.println(s);

    }

}
